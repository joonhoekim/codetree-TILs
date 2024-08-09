import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] arr = new int[N][N];

    for (int i = 0; i < M; i++) {
      int r = sc.nextInt()-1;
      int c = sc.nextInt()-1;
      arr[r][c] = 1;

      printIfComport(r, c, arr);
    }

  }
  public static void printIfComport(int r, int c, int[][] arr) {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int count = 0;
    boolean isComport = false;

    for (int i = 0; i < 4; i++) {
      int nr = r + dx[i];
      int nc = c + dy[i];
      if (inN(nr, nc, arr.length) && arr[nr][nc] == 1) {
        count++;
      }

      if (count == 3) {
        isComport = true;
      } else {
        isComport = false;
      }
    }

    if (isComport) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public static boolean inN(int n, int m, int N) {
    return n >= 0 && n < N && m >= 0 && m < N;
  }
}