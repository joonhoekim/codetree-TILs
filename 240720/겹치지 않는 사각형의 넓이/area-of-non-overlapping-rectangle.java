import java.util.Scanner;

public class Main {

  static int[][] arr = new int[2000][2000];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      int x1 = sc.nextInt() + 1000;
      int y1 = sc.nextInt() + 1000;
      int x2 = sc.nextInt() + 1000;
      int y2 = sc.nextInt() + 1000;

      if (i == 2) {
        for (int j = x1; j < x2; j++) {
          for (int k = y1; k < y2; k++) {
            arr[j][k] = 0;
          }
        }
      } else {
        fillArea(x1, y1, x2, y2, arr);
      }

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

  public static void fillArea(int x1, int y1, int x2, int y2,int[][] arr) {
    for (int j = x1; j < x2; j++) {
      for (int k = y1; k < y2; k++) {
        arr[j][k]++;
      }
    }
  }
}