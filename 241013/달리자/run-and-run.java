import java.util.Scanner;

public class Main {
  public static int MAX_N = 101;

  public static int[] A = new int[MAX_N];
  public static int[] B = new int[MAX_N];


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      B[i] = sc.nextInt();
    }

    int answer = 0;
    for (int i = 1; i < n; i++) {
      if (A[i] > B[i]) {
        A[i+1] += A[i] - B[i];
        answer += A[i] - B[i];
      }
    }

    System.out.println(answer);
  }
}