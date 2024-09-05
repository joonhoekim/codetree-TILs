import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // initializing
    int[] xArr = new int[N];
    int[] yArr = new int[N];

    for (int i = 0; i < N; i++) {
      xArr[i] = sc.nextInt();
      yArr[i] = sc.nextInt();
    }

    int result = Integer.MAX_VALUE;

    // x, y 배열 전체 순회
    for (int i = 0; i < N; i++) {
      int x1 = Integer.MIN_VALUE; // x 최댓값
      int x2 = Integer.MAX_VALUE; // x 최솟값
      int y1 = Integer.MIN_VALUE; // y 최댓값
      int y2 = Integer.MAX_VALUE; // y 최솟값

      // i를 제외한 나머지 점들로 가로 세로 길이를 구함
      for (int j = 0; j < N; j++) {
        if (i != j) {
          x1 = Math.max(x1, xArr[j]);
          x2 = Math.min(x2, xArr[j]);
          y1 = Math.max(y1, yArr[j]);
          y2 = Math.min(y2, yArr[j]);
        }
      }
      
      // 넓이 계산
      int area = (x1-x2) * (y1-y2);
      result = Math.min(result, area);
    }
    System.out.println(result);
  }
}