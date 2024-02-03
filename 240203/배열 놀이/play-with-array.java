import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < q; i++) {
      int qType = sc.nextInt();
      if (qType == 1) {
        int a = sc.nextInt();
        System.out.println(arr[a - 1]);
      } else if (qType == 2) {
        int a = sc.nextInt();
        int idx = 0;
        int count = 0;
        int firstIdx = 0;
        for (int j = 0; j < n; j++) {
          if (arr[j] == a) {
            if (firstIdx == 0) {
              firstIdx = j + 1;
            }
            idx = j + 1;
            count++;
          }
        }
        if (count > 1) {
          System.out.println(firstIdx);
        } else {
          System.out.println(idx);
        }

      } else if (qType == 3) {
        int a = sc.nextInt(), b = sc.nextInt();
        for (int j = a - 1; j < b; j++) {
          System.out.print(arr[j] + " ");
        }
        System.out.print("\n");
      }
    }
  }
}