import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int H = sc.nextInt();
    int T = sc.nextInt();

    int[] fields = new int[N];

    for (int i = 0; i < N; i++) {
      fields[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i <= N-T; i++) {
      int cost = 0;

      for (int j = i; j < i+T; j++) {
        cost += Math.abs(fields[j] - H);
      }
      min = Math.min(min, cost);

    }
    System.out.println(min);
  }
}