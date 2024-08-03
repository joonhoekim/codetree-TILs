import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    int result = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int countNo1 = 0;
        for (int dirNum = 0; dirNum < 4; dirNum++) {
          int nx = i + dx[dirNum], ny = j + dy[dirNum];
          if (inRange(nx, ny, n) && arr[nx][ny] == 1)
            countNo1++;
        }
        if (countNo1 >= 3) {
          result++;
        }
      }
    }

    System.out.println(result);
  }

  public static boolean inRange(int x, int y, int n) {
    return (0 <= x && x < n && 0 <= y && y < n);
  }
}