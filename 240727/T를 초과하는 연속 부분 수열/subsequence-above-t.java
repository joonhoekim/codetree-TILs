import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int count = 1;
    int max = Integer.MIN_VALUE;

    if (arr.length == 1) {
      if (arr[0] <= t) {
        max = 0;
      } else {
        max = 1;
      }
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (i == 0 || arr[i] <= t) {
          count = 0;
        } else {
          ++count;
        }

        if (count > max) {
          max = count;
        }
      }
    }
    
    System.out.println(max);
  }
}