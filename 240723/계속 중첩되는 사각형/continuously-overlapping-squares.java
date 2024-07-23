import java.util.Scanner;

public class Main {

  static int[][] arr = new int[200][200];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int x1 = sc.nextInt() + 100;
      int y1 = sc.nextInt() + 100;
      int x2 = sc.nextInt() + 100;
      int y2 = sc.nextInt() + 100;

      fillArea(x1, y1, x2, y2, i);
    }
    int countBlue = 0;

    for (int i = 0; i < arr.length; i++) {
      int[] inArr = arr[i];
      for (int j = 0; j < inArr.length; j++) {
        if (arr[i][j] == 2) {
          countBlue++;
        }
      }
    }

    System.out.println(countBlue);

  }
  private static void fillArea(int x1, int y1, int x2, int y2, int idx) {
    int value;

    if (idx % 2 == 0) {
      value = 1;
    } else {
      value = 2;
    }

    for (int i = x1; i < x2; i++) {
      for (int j = y1; j < y2; j++) {
        arr[i][j] = value;
      }
    }
  }
}