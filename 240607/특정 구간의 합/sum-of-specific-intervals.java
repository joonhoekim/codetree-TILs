import java.util.Scanner;

public class Main {

  public static int n, m;
  public static int[] A = new int[100];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();

    int[] resultArr = new int[m];

    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < m; i++) {
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();

      resultArr[i] = calcSum(a1, a2);
    }

    for (int result : resultArr) {
      System.out.println(result);
    }

    sc.close();
  }

  public static int calcSum(int a1, int a2) {
    int sum = 0;
    for (int i = a1; i <= a2; i++) {
      sum += A[i-1];
    }
    return sum;
  }


}