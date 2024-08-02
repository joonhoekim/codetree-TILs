import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int y = 0;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int dirNum = 1;
    String prompts = sc.next();

    for (int i = 0; i < prompts.length(); i++) {
      char direction = prompts.charAt(i);

      if (direction == 'L') {
        dirNum -= 1;
        if (dirNum < 0) {
          dirNum = 3;
        }
      } else if (direction == 'R') {
        dirNum = (dirNum+1) % 4;
      } else if (direction == 'F') {
        x += dx[dirNum];
        y += dy[dirNum];
      }
    }

    System.out.printf("%d %d", x, y);
  }
}