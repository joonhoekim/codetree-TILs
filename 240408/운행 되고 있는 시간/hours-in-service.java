import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] devs = new int[n][2];
    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      devs[i][0] = Integer.parseInt(input[0]);
      devs[i][1] = Integer.parseInt(input[1]);
    }

    //하나만 제외하는 완전탐색을 진행한다.
    int ans = 0;
    for (int i = 0; i < n; i++) {
      //i번째 인원을 제외한 경우의 운행시간을 구할 것이다.
      int[] day = new int[1001];

      int startTime = Integer.MAX_VALUE;
      int endTime = 0;
      for (int j = 0; j < n; j++) {
        startTime = Math.min(startTime, devs[j][0]);
        endTime = Math.max(endTime, devs[j][1]);
      }

      //운행여부를 day 배열에 더해서 시뮬레이션한다.
      for (int man = 0; man < n; man++) {
        //i 번째라면 제외한다.
        if (man == i) {
          continue;
        }
        for (int time = devs[man][0]; time < devs[man][1]; time++) {
          day[time]++;
        }
      }

      //운행시간을 구한다.
      int count = 0;
      for (int j = startTime; j <= endTime; j++) {
        if (day[j] != 0) {
          count++;
        }
      }

      //최대값을 갱신한다.
      ans = Math.max(ans, count);
    }

    System.out.println(ans);
  }
}