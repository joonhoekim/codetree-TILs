import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n+1];
    int minDistance = Integer.MAX_VALUE;

    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      int sumDistance = 0;

      for (int j = 1; j <= n; j++) {
        sumDistance += Math.abs((j-i) * arr[j]);
      }

      if (minDistance > sumDistance) {
        minDistance = sumDistance;
      }
    }

    System.out.println(minDistance);
  }
}