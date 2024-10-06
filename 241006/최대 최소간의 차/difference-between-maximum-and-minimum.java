import java.util.Scanner;

public class Main {

  public static int MAX_N = 100;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();
    int k = sc.nextInt();

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(max, arr[i]);
    }

    int answer = Integer.MAX_VALUE;

    for (int i = 1; i <= max; i++) {
      int cost = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] < i) {
          cost += Math.abs(arr[j] - i);
        } else if (arr[j] > i+k) {
          cost += Math.abs(arr[j] - (i+k));
        }
      }
      answer = Math.min(answer, cost);
    }
    System.out.println(answer);
  }
}