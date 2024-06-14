import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] A = input(sc, n);
    int[] B = input(sc, n);

    Arrays.sort(A);
    Arrays.sort(B);

    if (Arrays.equals(A, B)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

  public static int[] input(Scanner sc, int n) {
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    return arr;
  }
}