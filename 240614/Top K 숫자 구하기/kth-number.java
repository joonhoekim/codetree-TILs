import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int k = sc.nextInt()-1;

    int[] arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    System.out.println(arr[k]);

    sc.close();
  }
}