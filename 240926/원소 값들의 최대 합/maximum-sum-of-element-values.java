import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    int answer = Integer.MIN_VALUE;

    for (int i = 1; i <= n; i++) {
      int sum = 0;
      int idx = i;
      for (int j = 0; j < m; j++) {
        sum += arr[idx];
        idx = arr[idx];
      }

      answer = Math.max(answer, sum);
    }

    System.out.println(answer);
  }
}