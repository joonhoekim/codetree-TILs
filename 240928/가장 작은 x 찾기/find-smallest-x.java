import java.util.Scanner;

public class Main {
  public static int MAX_N = 10;
  public static int[] a = new int[MAX_N];
  public static int[] b = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();
    System.out.println();

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;

    // x가 모든 조건은 만족해야 하므로 첫번째 ai 와 bi 조건에 맞는 범위를 x로 완전탐색
    for (int i = a[0]; i <= b[0]; i++) {
      boolean isMeet = true;
      int x = i; // x를 별도로 지정(2곱하기를 반복하기 위해)

      // n번 반복
      for (int j = 0; j < n; j++) {
        x *= 2;
        // 조건에 맞지 않으면 false 처리
        if (x < a[j] || x > b[j]) {
          isMeet = false;
          break;
        }
      }

      // 조건을 충족하는 경우 정답 갱신
      // x가 작은 값부터 시작하기 때문에
      if (isMeet) {
        min = i;
        break;
      }
    }

    System.out.println(min);
  }
}