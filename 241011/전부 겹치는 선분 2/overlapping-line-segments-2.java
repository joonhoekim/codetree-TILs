import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] x1 = new int[MAX_N];
  public static int[] x2 = new int[MAX_N];


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      x1[i] = sc.nextInt();
      x2[i] = sc.nextInt();
    }
    boolean isIntersecting = false;

    // i 선분 제외
    for (int i = 0; i < n; i++) {
      int maxX1 = Integer.MIN_VALUE;
      int minX2 = Integer.MAX_VALUE;
      // n-1개의 선분 중 최대x1값과 최소x2값 계산
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }

        maxX1 = Math.max(maxX1, x1[j]);
        minX2 = Math.min(minX2, x2[j]);
      }

      if (minX2 >= maxX1) {
        isIntersecting = true;
        break;
      }
    }

    if (isIntersecting) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}