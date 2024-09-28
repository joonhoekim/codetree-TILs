import java.util.Scanner;

public class Main {
  public static int MAX_N = 10;
  public static int MAX_AB = 10000;
  public static int[] a = new int[MAX_N];
  public static int[] b = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;

    // 가능한 x의 모든 범위 완전탐색
    // min값이 갱신되면 반복문이 종료되도록 구현함.
    // -> x가 작은값부터 순서대로 탐색하기 때문
    for (int i = 1; i <= MAX_AB; i++) {
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
      if (isMeet) {
        min = i;
        break;
      }
    }

    System.out.println(min);
  }
}