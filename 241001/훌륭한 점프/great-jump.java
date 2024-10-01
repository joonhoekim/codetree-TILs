import java.util.Scanner;

public class Main {
  public static int n;
  public static int k;
  public static int MAX_N = 100;
  public static int[] stones = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    n = sc.nextInt();
    k = sc.nextInt();

    for (int i = 0; i < n; i++) {
      stones[i] = sc.nextInt();
    }

    for (int m = Math.max(stones[0], stones[n-1]); m <= MAX_N; m++) {
      if (isPossible(m)) {
        System.out.println(m);
        break;
      }
    }
  }

  public static boolean isPossible(int a) {
    int idx = 0;
    for (int i = 0; i < n; i++) {
      if (stones[i] <= a) {
        if (i - idx > k) {
          return false;
        }
        idx = i;
      }
    }

    return true;
  }
}