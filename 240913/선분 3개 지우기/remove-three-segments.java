import java.util.Scanner;

public class Main {
  public static int[] start = new int[100];
  public static int[] end = new int[100];
  public static int n;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      start[i] = sc.nextInt();
      end[i] = sc.nextInt();
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          int[] arr = new int[100];

          for (int l = 0; l < n; l++) {

            if (l == i || l == j || l == k) {
              continue;
            }
            drawLine(l, arr);
          }

          if (!checkOverlap(arr)) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }

  public static void drawLine(int l, int[] arr) {
    for (int i = start[l]; i <= end[l]; i++) {
      arr[i]++;
    }
  }

  public static boolean checkOverlap(int[] arr) {
    for (int p : arr) {
      if (p > 1) {
        return true;
      }
    }

    return false;
  }
}