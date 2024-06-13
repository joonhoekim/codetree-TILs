import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(getLeast(arr, 1));

    sc.close();
  }


  public static int getLeast(int[] arr, int N) {
    boolean isLeast = true;

    for (int i : arr) {
      if (N % i != 0) {
        isLeast = false;
      }
    }

    if (isLeast)
      return N;

    return getLeast(arr, N+1);
  }


}