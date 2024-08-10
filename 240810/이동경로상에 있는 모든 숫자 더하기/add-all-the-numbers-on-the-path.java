import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int T = sc.nextInt();
    char[] orders = sc.next().toCharArray();
    int[][] arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    int dirNum = 0;

    int x = N/2;
    int y = N/2;

    int count = arr[x][y];

    for (int i = 0; i < T; i++) {

      if (orders[i] == 'L') {
        dirNum = (dirNum + 3) % 4;

      } else if (orders[i] == 'R') {
        dirNum = (dirNum + 1) % 4;

      } else if (orders[i] == 'F') {
        int nx = x + dx[dirNum];
        int ny = y + dy[dirNum];

        if (inRange(nx, ny, N)) {
          count += arr[nx][ny];
          x = nx;
          y = ny;

        }
      }
    }

    System.out.println(count);
  }

  public static boolean inRange(int x, int y, int N) {
    return x >= 0 && x < N && y >= 0 && y < N;
  }
}