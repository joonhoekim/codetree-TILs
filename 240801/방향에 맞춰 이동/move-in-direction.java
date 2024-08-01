import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int y = 0;
    int[] dx = {-1, 0, 0, 1};
    int[] dy = {0, -1, 1, 0};
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      char direction = sc.next().charAt(0);
      int n = sc.nextInt();
      int inputIndex = getIndex(direction);
      x += dx[inputIndex] * n;
      y += dy[inputIndex] * n;
    }

    System.out.printf("%d %d", x, y);
  }
  public static int getIndex(char c) {
    int answer = -1;

    switch (c) {
      case 'W':
        answer = 0;
        break;
      case 'S':
        answer = 1;
      break;
      case 'N':
        answer = 2;
      break;
      case 'E':
        answer = 3;
      break;
    }
    return answer;
  }
}