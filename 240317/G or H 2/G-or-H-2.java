import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 사람 수

        boolean[] hasPerson = new boolean[101]; // 위치에 사람이 있는지 여부를 저장하는 배열
        int[] countG = new int[101]; // 위치별 'G' 개수 카운트 배열
        int[] countH = new int[101]; // 위치별 'H' 개수 카운트 배열

        // 각 위치별로 'G'와 'H'의 개수를 카운트하고, 위치에 사람이 있는지 여부를 저장합니다.
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int position = Integer.parseInt(input[0]); // 위치
            char character = input[1].charAt(0); // 팻말
            hasPerson[position] = true; // 해당 위치에 사람이 있는지 여부를 true로 설정
            if (character == 'G') {
                countG[position]++;
            } else {
                countH[position]++;
            }
        }

        int maxSize = 0; // 최대 사진 크기

        // 각 위치에서 시작하여 가능한 모든 사진 크기 확인
        for (int startPoint = 0; startPoint <= 100; startPoint++) {
            // 시작점에 사람이 없으면 다음 위치로 건너뜁니다.
            if (!hasPerson[startPoint]) {
                continue;
            }
            for (int endPoint = startPoint; endPoint <= 100; endPoint++) {
                // 끝점에 사람이 없으면 다음 위치로 건너뜁니다.
                if (!hasPerson[endPoint]) {
                    continue;
                }
                int totalG = 0; // 'G'의 총 개수
                int totalH = 0; // 'H'의 총 개수

                // startPoint부터 endPoint까지 'G'와 'H'의 개수 합산
                for (int i = startPoint; i <= endPoint; i++) {
                    totalG += countG[i];
                    totalH += countH[i];
                }

                // 'G'와 'H'가 모두 없거나 개수가 같은 경우
                if ((totalG == 0 && totalH != 0) || (totalG != 0 && totalH == 0) || totalG == totalH) {
                    maxSize = Math.max(maxSize, endPoint - startPoint);
                }
            }
        }

        bw.write(maxSize + "\n"); // 최대 사진 크기 출력

        bw.flush();
        bw.close();
        br.close();
    }
}