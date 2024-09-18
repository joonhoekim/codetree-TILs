import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] a = new int[MAX_N];
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;


    for (int k = 1; k <= MAX_N; k++) {
      int count = 0;

      for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
          if (a[j] - k == k - a[i]) {
            count++;
          }
        }
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}