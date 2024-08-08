import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] order = sc.next().toCharArray();
    int x = 0;
    int y = 0;
    int t = 0;

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int dirNum = 0;
    boolean isBack = false;

    for (int i = 0; i < order.length; i++) {
      char c = order[i];
      if (c == 'F') {
        x = x + dx[dirNum]; y = y + dy[dirNum];
      } else if (c == 'R') {
        dirNum = (dirNum + 1) % 4;
      } else if (c =='L') {
        dirNum = (dirNum-1) < 0 ? 3 : (dirNum-1);
      }

      t++;
      if (x == 0 && y == 0 && i != 0) {
        isBack = true;
        break;
      }
    }

    if (isBack) {
      System.out.println(t);
    } else {
      System.out.println(-1);
    }
  }
}