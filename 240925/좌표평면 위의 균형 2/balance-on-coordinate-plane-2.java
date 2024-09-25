import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] x = new int[MAX_N];
  public static int[] y = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    int answer = Integer.MAX_VALUE;

    for (int i = 0; i <= MAX_N; i += 2) {
      for (int j = 0; j <= MAX_N; j += 2) {
        int max = Integer.MIN_VALUE;

        int count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] > i && y[k] > j) {
            count++;
          }
        }
        max = Math.max(max, count);

        count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] < i && y[k] > j) {
            count++;
          }
        }
        max = Math.max(max, count);

        count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] > i && y[k] < j) {
            count++;
          }
        }
        max = Math.max(max, count);

        count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] < i && y[k] < j) {
            count++;
          }
        }
        max = Math.max(max, count);

        answer = Math.min(answer, max);
      }
    }

    System.out.println(answer);
  }
}