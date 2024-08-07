import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
         * 상황
         * 입력은 사람들이 살고 있는 장소들을 나타낸다 (길이 n)
         * 거리 m 까지 와이파이가 닿는다
         * 풀커버리지를 위한 최소 와이파이 개수를 구하자
         * 사람이 있건 없건 모든 자리에 와이파이 배치가 가능하다.
         *
         * 분석
         * - 먼저 와이파이를 배치하는 게 최선은 아니다.
         * - 이전 사람이 와이파이를 쓸 수 없게되는 한계를 찾아서 그 때 배치하자
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        boolean[] wifiCovered = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int zoneCoverage = 1 + 2 * m;
        int zoneOffset = m;
        int count = 0;

        for (int i = m; i < n - m; i++) {
            //현재 지역이 커버되는지 확인하고
            boolean isCovered = false;
            for (int j = i - m; j <= i + m; j++) {
                if (wifiCovered[j]) {
                    isCovered = true;
                    break;
                }
            }
            //커버되지 않는 경우에 설치 + 커버리지에 기록
            if (!isCovered) {
                count++;
                for (int j = i - m; j <= i + m; j++) {
                    wifiCovered[j] = true;
                }
            }
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();

    }
}