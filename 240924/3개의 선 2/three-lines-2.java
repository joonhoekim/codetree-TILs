import java.util.Scanner;

public class Main {
  public static int MAX_N = 20;
  public static int MAX_XY = 10;
  public static int[] xArr = new int[MAX_N];
  public static int[] yArr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      xArr[i] = sc.nextInt();
      yArr[i] = sc.nextInt();
    }
    int answer = 0;

    for (int i = 0; i <= MAX_XY; i++) {
      for (int j = 0; j <= MAX_XY; j++) {
        for (int k = 0; k <= MAX_XY; k++) {

          boolean isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (xArr[l] == i || xArr[l] == j || xArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (xArr[l] == i || xArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (xArr[l] == i || yArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (yArr[l] == i || yArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }
        }
      }
    }
    System.out.println(answer);
  }
}