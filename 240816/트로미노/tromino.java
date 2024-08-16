import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  /*
   * 문제 이해
   * - 이차원 영역에 자연수들이 적혀있음
   * - ㄴ, ㅡ 모양의 블럭 두 개를 슬라이딩 윈도우처럼 적용함
   *   - 블럭은 한 개만 써야 함
   *   - 블럭을 회전시킬 수 있음 (디지털이므로 90도만 가능함)
   *   - 블럭을 반전시킬 수 있음 (뒤집기)
   *   - 블럭이 밖으로 벗어나면 안됨
   * - 블럭 내의 숫자들의 합으로 만들 수 있는 최댓값은?
   *
   * 접근
   * - 블럭을 회전하거나 뒤집는 것을 어떻게 처리할까?
   * - 블럭이 두개뿐이므로 하드코딩할 수도 있고,
   * - 이차원 배열에 대해 선형대수 이론을 적용하여 뒤집기, 회전을 구현할 수 있다.
   *
   * 구현
   * - 우선 블럭이 동적으로 주어지지 않고, 정해져 있으니 쉬운 하드코딩으로 풀어본다.
   *
   * */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] board = new int[n][m];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }

    }

    int globalmax = 0;
    //r, c 는 블럭의 시작점 (왼쪽 위)이다.
    for (int r = 0; r < n - 1; r++) {
      for (int c = 0; c < m - 1; c++) {

        //i 에 따라 ㄴ 자 블럭 회전을 구현한다.

        for (int i = 0; i < 4; i++) {
          int[] blockSum = new int[4];
          blockSum[0] += board[r][c];
          blockSum[1] += board[r + 1][c];
          blockSum[2] += board[r][c + 1];
          blockSum[3] += board[r + 1][c + 1];
          int localSum = 0;
          for (int j = 0; j < 4; j++) {
            if (i == j) {
              continue;
            }
            localSum += blockSum[j];
          }
          globalmax = Math.max(localSum, globalmax);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
      }
    }

    // ㅡ 자 블럭 처리
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < m - 2; c++) {
        int localSum = 0;
        for (int i = c; i < c + 3; i++) {
          localSum += board[r][i];
        }
        globalmax = Math.max(localSum, globalmax);
      }
    }

    // ㅣ 자 블럭 처리
    for (int r = 0; r < n - 2; r++) {
      for (int c = 0; c < m; c++) {
        int localSum = 0;
        for (int i = r; i < r + 3; i++) {
          localSum += board[i][c];
        }
        globalmax = Math.max(localSum, globalmax);
      }
    }

    System.out.println(globalmax);
    br.close();

  }

}