import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int MAX_H = 1000;
  public static int[] H = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    for (int i = 1; i <= MAX_H; i++) {
      int count = 0;
      for (int j = 0; j < MAX_N-1; j++) {
        if (H[j] - i > 0 && H[j+1] - i < 1) {
            count++;
        }
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}