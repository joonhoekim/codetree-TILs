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

        int lineCount = Integer.parseInt(br.readLine());
        Line[] lines = new Line[lineCount];
        for (int i = 0; i < lineCount; i++) {
            String[] input = br.readLine().split(" ");
            lines[i] = new Line(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        int answer = 0;

        //제거할 3가지를 선택하자.
        for (int i = 0; i < lines.length - 2; i++) {
            for (int j = i + 1; j < lines.length - 1; j++) {
                for (int k = j + 1; k < lines.length; k++) {
                    //그 3가지 제거한 경우 중복이 없는지 확인하자.
                    if (checkUnoverwrappedWithExclusion(lines, i, j, k)) {
                        answer++;
                    }
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean checkUnoverwrappedWithExclusion(Line[] lines, int i, int j, int k) {
        for (int line1Idx = 0; line1Idx < lines.length; line1Idx++) {
            if (line1Idx == i || line1Idx == j || line1Idx == k) continue;

            for (int line2Idx = line1Idx + 1; line2Idx < lines.length; line2Idx++) {
                if (line2Idx == i || line2Idx == j || line2Idx == k) continue;

                if (!isSeparated(lines[line1Idx], lines[line2Idx])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSeparated(Line line1, Line line2) {
        return line1.endX < line2.startX || line1.startX > line2.endX;
    }
}