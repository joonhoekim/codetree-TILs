import java.util.Scanner;

public class Main {

  static int[][] arr = new int[200][200];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int x1 = sc.nextInt() + 100;
      int y1 = sc.nextInt() + 100;

      fillArea(x1, y1, arr);
    }

    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      int[] inArr = arr[i];

      for (int j = 0; j < inArr.length; j++) {
        if (inArr[j] != 0) {
          count++;
        }
      }
    }

    System.out.println(count);

  }

  public static void fillArea(int x1, int y1 ,int[][] arr) {
    for (int j = x1; j < x1+8; j++) {
      for (int k = y1; k < y1+8; k++) {
        arr[j][k] = 1;
      }
    }
  }
}