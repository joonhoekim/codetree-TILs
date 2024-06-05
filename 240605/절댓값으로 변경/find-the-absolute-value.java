import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    absolute(arr);

    for (int value : arr) {
      System.out.print(value + " ");
    }

    sc.close();
  }

  public static void absolute(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] *= -1;
      }
    }
  }

}