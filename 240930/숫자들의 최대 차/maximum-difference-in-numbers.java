import java.util.Scanner;

public class Main {
  public static int MAX_N = 1000;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i <= K; i++) {
      int count = 0;
      for (int j = 0; j < N; j++) {
        if (i <= arr[j] && arr[j] <= i+K) {
          count++;
        }
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}