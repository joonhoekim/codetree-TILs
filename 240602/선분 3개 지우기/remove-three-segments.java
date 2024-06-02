import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Line {
    int startX;
    int endX;

    Line(int startX, int endX) {
        this.startX = startX;
        this.endX = endX;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        int lineCount = Integer.parseInt(br.readLine());
        Line[] lines = new Line[lineCount];
        for (int i = 0; i < lineCount; i++) {
            String[] input = br.readLine().split(" ");
            lines[i] = new Line(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        int n = 3;
        int answer = 0;

        List<int[]> combinations = generateCombinations(lineCount, n);
        for (int[] combination : combinations) {
            if (checkUnoverwrappedWithExclusion(lines, combination)) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean checkUnoverwrappedWithExclusion(Line[] lines, int[] excludedIdx) {
        for (int line1Idx = 0; line1Idx < lines.length; line1Idx++) {
            if (isExcluded(line1Idx, excludedIdx)) continue;

            for (int line2Idx = line1Idx + 1; line2Idx < lines.length; line2Idx++) {
                if (isExcluded(line2Idx, excludedIdx)) continue;

                if (!isSeparated(lines[line1Idx], lines[line2Idx])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isExcluded(int index, int[] excludedIdx) {
        for (int excluded : excludedIdx) {
            if (index == excluded) return true;
        }
        return false;
    }

    private static boolean isSeparated(Line line1, Line line2) {
        return line1.endX < line2.startX || line1.startX > line2.endX;
    }

    private static List<int[]> generateCombinations(int total, int select) {
        List<int[]> combinations = new ArrayList<>();
        combinationHelper(combinations, new int[select], 0, total - 1, 0);
        return combinations;
    }

    private static void combinationHelper(List<int[]> combinations, int[] data, int start, int end, int index) {
        if (index == data.length) {
            combinations.add(data.clone());
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= data.length - index; i++) {
            data[index] = i;
            combinationHelper(combinations, data, i + 1, end, index + 1);
        }
    }
}