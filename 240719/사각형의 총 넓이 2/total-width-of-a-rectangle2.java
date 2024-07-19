import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[][] arr = new int[200][200];

    for (int i = 0; i < N; i++) {
      int x1 = sc.nextInt() + 100;
      int y1 = sc.nextInt() + 100;
      int x2 = sc.nextInt() + 100;
      int y2 = sc.nextInt() + 100;

      for (int j = x1; j < x2; j++) {
        for (int k = y1; k < y2; k++) {
          arr[j][k] = 1;
        }
      }
    }

    System.out.println(getArea(arr));
  }

  public static int getArea(int[][] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int[] inArr = arr[i];

      for (int j = 0; j < inArr.length; j++) {
        count += inArr[j];
      }
    }
    return count;
  }
}