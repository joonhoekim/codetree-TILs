import java.util.Scanner;

public class Main {
  public static int[] a = new int[101];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;

      int count = 0;
      for (int i = 1; i <= n; i++) {
        for (int j = i+1; j <= n; j++) {
          for (int k = 1; k <= n; k++) {
            if (a[j] - k == k - a[i]) {
              count++;
            }
        }
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}