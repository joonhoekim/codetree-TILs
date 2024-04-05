import java.util.Scanner;

class Xy {
  int x;
  int y;

  public Xy(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Xy[] points = new Xy[n];
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      points[i] = new Xy(x, y);
    }

    // 최소값을 갱신할 변수
    int globalMinArea = Integer.MAX_VALUE;

    for (int i = 0; i < points.length; i++) { // POINT : 모든 점에 대해서
      Xy localMinXy = new Xy(40000, 40000);
      Xy localMaxXy = new Xy(0, 0);

      // for (int j = 0; j < points.length; j++) {
      // 나머지에 대해서 최소, 최대 x / y 를 구하고
      for (int k = 0; k < points.length; k++) {
        if (k == i) // POINT : 이 위치가 포인트
          continue; // 하나씩 빼본다.

        localMinXy.x = Math.min(localMinXy.x, points[k].x);
        localMinXy.y = Math.min(localMinXy.y, points[k].y);
        localMaxXy.x = Math.max(localMaxXy.x, points[k].x);
        localMaxXy.y = Math.max(localMaxXy.y, points[k].y);
      }
      // 그것으로 전부 포함하는 직사각형의 넓이를 구한다.
      int localMinArea = getRectArea(localMinXy, localMaxXy);

      // 그리고 직사각형의 최소값을 구한다.
      globalMinArea = Math.min(globalMinArea, localMinArea);
      // }
    }

    System.out.println(globalMinArea);
  }

  private static int getRectArea(Xy localMinXy, Xy localMaxXy) {
    return (localMaxXy.x - localMinXy.x) * (localMaxXy.y - localMinXy.y);
  }
}