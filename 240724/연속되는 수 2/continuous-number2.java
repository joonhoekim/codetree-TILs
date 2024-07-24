import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int maxValue = 0;
    int count = 0;

    if (N < 2) {
      System.out.println(1);
    } else {

      for (int i = 0; i < arr.length-1; i++) {
        if (arr[i] != arr[i+1]) {
          count = 1;
        } else {
          ++count;
          if (maxValue < count) {
            maxValue = count;
          }
        }
      }

      System.out.println(maxValue);
    }



  }
}