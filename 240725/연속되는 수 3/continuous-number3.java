import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int count = 0;
    int max = Integer.MIN_VALUE;

    if (N == 1) {
      System.out.println(1);
    } else {

      for (int i = 0; i < arr.length; i++) {
        if (i == 0 || plusOrMinus(arr[i]) != plusOrMinus(arr[i-1])) {
          count = 1;
        } else {
          ++count;
        }
        
        if (count > max) {
          max = count;
        }

      }

      System.out.println(max);
    }
  }

  public static int plusOrMinus(int n) {
    return n > 0 ? 1 : 0;
  }
}