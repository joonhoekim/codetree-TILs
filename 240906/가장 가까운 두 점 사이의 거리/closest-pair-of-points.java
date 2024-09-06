import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] xArr = new int[N];
    int[] yArr = new int[N];

    // initializing
    for (int i = 0; i < N; i++) {
        xArr[i] = sc.nextInt();
        yArr[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;

    // i와 j를 겹치지않게 모두 선택하는 완전탐색
    for (int i = 0; i < N-1; i++) {
      for (int j = i+1; j < N; j++) {
        int distance = getDistance(xArr[i], yArr[i], xArr[j], yArr[j]);
        min = Math.min(min, distance);
      }
    }
    System.out.println(min);
  }

  public static int getDistance(int x1, int y1, int x2, int y2) {
    return (x1 - x2) * (x1 - x2) + (y1 -y2) * (y1 -y2);
  }
}