//이전 코드는 작성하는데 시간이 많이 든다. 비효율적이지만 더 짧게 푸는 법...
import java.util.Scanner;

public class Main {

  public static final int MAX_M = 100;
  public static int[] a = new int[MAX_M];
  public static int[] b = new int[MAX_M];
  static int n;
  static int m;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int globalMax = 0;
    for (int i = 1; i <= n ; i++) {
      for( int j = i + 1; j <=n; j++) {
        globalMax = Math.max(globalMax, countDuplicated(i, j));
      }
    }

    System.out.println(globalMax);
  }

  static int countDuplicated(int first, int second) {
    int count = 0;
    for (int i = 0; i < m; i++) {
      if( (first == a[i] && second == b[i]) || (first == b[i] && second == a[i])) {
        count++;
      }
    }
    return count;
  }

}