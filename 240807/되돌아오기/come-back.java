import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int x = 0;
    int y = 0;
    int t = 0;

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int dirNum = -1;
    boolean isBack = false;

    for (int i = 0; i < N; i++) {
      if (isBack) {
        break;
      }
      dirNum = getDir(sc.next().charAt(0));
      int distance = sc.nextInt();

      while (--distance >= 0) {
        x = x + dx[dirNum]; y = y + dy[dirNum];
        t++;
        if (x == 0 && y == 0 && i != 0) {
          isBack = true;
          break;
        }
      }
    }

    if (isBack) {
      System.out.println(t);
    } else {
      System.out.println(-1);
    }
  }

  public static int getDir(char c) {
    if (c == 'N') {
      return 0;
    } else if (c == 'E') {
      return 1;
    } else if (c == 'S') {
      return 2;
    } else  {
      return 3;
    }
  }
}