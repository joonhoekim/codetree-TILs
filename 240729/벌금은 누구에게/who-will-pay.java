import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();

    int[] penalties = new int[N];

    for (int i = 0; i < M; i++) {
      int num = sc.nextInt();
      penalties[num-1]++;

      if (getPenalty(penalties, K) != -1) {
        break;
      }
    }

    System.out.println(getPenalty(penalties, K));

  }
  public static int getPenalty(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= num) {
        return i+1;
      }
    }
    return -1;
  }


}