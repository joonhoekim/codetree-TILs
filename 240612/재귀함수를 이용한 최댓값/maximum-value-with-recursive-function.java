import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(findMax(n, arr));

    sc.close();
  }

  public static int findMax(int n, int[] arr) {
    if (n == 1)
      return arr[n];

    return Math.max(findMax(n - 1, arr), arr[n-1]);
  }

}