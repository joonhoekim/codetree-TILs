import java.util.Scanner;

public class Main {

  static int[][] arr = new int[2000][2000];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      int x1 = sc.nextInt() + 1000;
      int y1 = sc.nextInt() + 1000;
      int x2 = sc.nextInt() + 1000;
      int y2 = sc.nextInt() + 1000;

      areaChecker(x1, y1, x2, y2, i);
    }

    int minX = 2000;
    int maxX = 0;
    int minY = 2000;
    int maxY = 0;
    boolean isAreaExist = false;

    for (int i = 0; i < arr.length; i++) {
      int[] inArr = arr[i];
      for (int j = 0; j < inArr.length; j++) {
        if (inArr[j] == 1) {
          isAreaExist = true;

          if (i < minX ) {
            minX = i;
          }

          if (j < minY) {
            minY = j;
          }

          if (i > maxX) {
            maxX = i;
          }

          if (j > maxY) {
            maxY = j;
          }
        }
      }
    }
    if (isAreaExist) {
      System.out.println((maxX - minX + 1) * (maxY - minY + 1));
    } else {
      System.out.println(0);
    }


  }
  private static void areaChecker(int x1, int y1, int x2, int y2, int idx) {
    int value = 0;
    if (idx == 0) {
      value = 1;
    }

    for (int i = x1; i < x2; i++) {
      for (int j = y1; j < y2; j++) {
        arr[i][j] = value;
      }
    }
  }
}