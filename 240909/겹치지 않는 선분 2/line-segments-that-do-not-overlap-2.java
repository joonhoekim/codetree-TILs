import java.util.Scanner;

public class Main {

  public  static int[] x1 = new int[100];
  public static int[] x2 = new int[100];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      x1[i] = sc.nextInt();
      x2[i] = sc.nextInt();
    }

    int count = 0;

    // i번째 선분이 다른 모든 선분과 겹치는지 완전탐색
    for (int i = 0; i < N; i++) {

      boolean overlap = false;

      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }
        // i번째 선분의 x1이 작고 x2가 큰 경우와 x1이 크고 x2가 작은 경우 선분이 겹침
        if ((x1[i] <= x1[j] && x2[i] >= x2[j]) || (x1[i] >= x1[j] && x2[i] <= x2[j])) {
          // 겹치는 경우 반복 중단
          overlap = true;
          break;
        }
      }

      if (!overlap) {
        count++;
      }
    }
    System.out.println(count);
  }
}