import java.util.Scanner;

public class Main {

  static void set2dArr(int[][] arr, Scanner sc) {
    int n = arr.length;
    int m = arr[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  }

  static void print2dArr(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("\n");
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];

    int count = 0;
    int i = 0;
    int j = 0;
    int iMem = 0;
    int jMem = 0;

    while (count != n * m) {
      // 난 솔직히 98분으론 택도 없었다.

      if (i < n && j < m && 0 <= i && 0 <= j) { //사실 i는 검사할 필요가 없지만 의미가 명확해진다.
        arr[i][j] = ++count;
      }

      i++;
      j--;

      if (i >= n || j < 0) {
        i = iMem;
        j = ++jMem;
      }

    }

    print2dArr(arr);
  }
}