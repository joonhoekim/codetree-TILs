import java.util.Scanner;

public class Main {
  public static int a1;
  public static int b1;
  public static int c1;
  public static int a2;
  public static int b2;
  public static int c2;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    a1 = sc.nextInt();
    b1 = sc.nextInt();
    c1 = sc.nextInt();

    a2 = sc.nextInt();
    b2 = sc.nextInt();
    c2 = sc.nextInt();

    int count = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        for (int k = 1; k <= N; k++) {
          if (isOpen(i, j, k, N)) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }

  public static boolean isOpen(int i, int j, int k, int N) {
    if ((Math.abs(a1-i) < 3 || Math.abs(a1-i) >= N-2) &&
        (Math.abs(b1-j) < 3 || Math.abs(b1-j) >= N-2) &&
        (Math.abs(c1-k) < 3 || Math.abs(c1-k) >= N-2)) {
      return true;
    } else if ((Math.abs(a2-i) < 3 || Math.abs(a2-i) >= N-2) &&
        (Math.abs(b2-j) < 3 || Math.abs(b2-j) >= N-2) &&
        (Math.abs(c2-k) < 3 || Math.abs(c2-k) >= N-2)) {
      return true;
    } else {
      return false;
    }
  }
}