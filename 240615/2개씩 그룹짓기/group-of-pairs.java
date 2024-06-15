import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = 2*sc.nextInt();
    int[] arr = new int[N];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    for (int i = 0; i < N; i++) {
      int m = arr[i] + arr[arr.length-i-1];
      if (max < m) {
        max = m;
      }
    }

    System.out.println(max);

    sc.close();
  }
}