import java.util.Scanner;

public class Main {
  public static int[] box = new int[100];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      box[i] = sc.nextInt();
    }

    int bombNo = -1;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }

        boolean isRange = Math.abs(i - j) <= K;
        if (!isRange) {
          continue;
        }

        if (box[i] == box[j]) {
          bombNo = Math.max(bombNo, box[j]);
        }
      }
    }

    System.out.println(bombNo);
  }
}