import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] A = new int[N];
    int[] B = new int[M];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < M; i++) {
      B[i] = sc.nextInt();
    }
    Arrays.sort(B);

    int count = 0;

    int[] arr = new int[M];
    for (int i = 0; i <= N-M; i++) {

      System.arraycopy(A, i, arr, 0, M);
      Arrays.sort(arr, 0, M);

      boolean isSame = true;
      for (int j = 0; j < M; j++) {
        if (arr[j] != B[j]) {
          isSame = false;
          break;
        }
      }
      if (isSame) {
        count++;
      }

    }
    System.out.println(count);
  }
}