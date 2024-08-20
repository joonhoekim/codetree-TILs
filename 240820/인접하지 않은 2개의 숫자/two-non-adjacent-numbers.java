import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N-2; i++) {
      for (int j = i + 2; j < N; j++) {
        max = Math.max(max, arr[i] + arr[j]);
      }
    }

    System.out.println(max);
  }
}