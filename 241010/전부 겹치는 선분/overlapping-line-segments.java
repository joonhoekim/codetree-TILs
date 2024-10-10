import java.util.Scanner;

public class Main {
  public static final int INT_MAX = Integer.MAX_VALUE;
  public static int x1, x2;
  public static int maxX1;
  public static int minX2 = INT_MAX;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      x1 = sc.nextInt();
      x2 = sc.nextInt();
      maxX1 = Math.max(maxX1, x1);
      minX2 = Math.min(minX2, x2);
    }

    if (minX2 >= maxX1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}