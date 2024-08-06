import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int m = sc.nextInt();

    int[][] square = new int[n][m];

    int x = 0;
    int y = 0;

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int dirNum = 0;
    square[x][y] = 1;

    for (int i = 2; i <= n * m; i++) {

      int nx = x + dx[dirNum], ny = y + dy[dirNum];

      if (!inRange(nx, ny, n, m) || square[nx][ny] != 0) {
        dirNum = (dirNum + 1) % 4;
      }

      x = x + dx[dirNum];
      y = y + dy[dirNum];

      square[x][y] = i;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.printf("%d ", square[i][j]);
      }
      System.out.println();
    }
  }

  public static boolean inRange(int x, int y, int n, int m) {
    return 0 <= x && x < n && 0 <= y && y < m;
  }

}