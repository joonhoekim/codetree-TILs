import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 격자
    int t = sc.nextInt(); // 초

    int r = sc.nextInt(); //행
    int c = sc.nextInt(); //열
    char d = sc.next().charAt(0);

    int x = r-1;
    int y = c-1;

    int[] dx = {0, 1, -1, 0};
    int[] dy = {1, 0, 0, -1};

    int dirNum = getDirNum(d);

    for (int i = 0; i < t; i++) {
      int nx = x + dx[dirNum], ny = y + dy[dirNum];
      if (inRange(nx, ny, n)) {
        x = x + dx[dirNum];
        y = y + dy[dirNum];
      } else {
        dirNum = 3 - dirNum;
      }
    }
    System.out.printf("%d %d", x+1, y+1);
  }

  public static boolean inRange(int x, int y, int n) {
    return 0 <= x && x < n && 0 <= y && y < n;
  }

  public static int getDirNum(char c) {
    if (c == 'U') {
      return 2;
    } else if (c == 'D') {
      return 1;
    } else if (c == 'R') {
      return 0;
    } else {
      return 3;
    }
  }
}