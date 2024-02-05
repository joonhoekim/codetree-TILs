import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    //최대값 idx 를 구하고, 그 idx가 1이 되기 전까지 계속 반복해서 idx를 구한다.
    int idx = n - 1; // 가장 왼쪽의 최댓값을 구하므로 우측부터 구한다.
    while (idx >= 0) {
      int max = Integer.MIN_VALUE;

      for (int i = idx; i >= 0; i--) {
        if (arr[i] >= max) {
          max = arr[i];
          idx = i;
        }
      }
      System.out.print(idx + 1 + " ");
      idx--;
    }

  }
}