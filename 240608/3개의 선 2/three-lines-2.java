import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int size = 20;

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Point[] points = new Point[n];

    for (int i = 0; i < n; i++) {
      points[i] = new Point(sc.nextInt(), sc.nextInt());
    }

    //3개인 경우... 가로3 가로2 가로1 가로0...
    //가로선을 먼저 긋던 세로선을 먼저 긋던 그것은 관계없으니 항상 세로선을 먼저 긋는 경우로 가정하자.
    //vvv, vvh, vhh, hhh 이렇게 4가지 경우가 있다.
    for (int vCount = 0; vCount <= 3; vCount++) {
      //vvv, vvh, vhh, hhh
      boolean[] isVert = new boolean[3];
      for (int i = 0; i < vCount; i++) {
        isVert[i] = true;
      }

      for (int i = 0; i <= size; i++) {
        for (int j = 0; j <= size; j++) {
          for (int k = 0; k <= size; k++) {

            if (isVert[0]) {
              Point.checkVert(points, i);
            } else {
              Point.checkHoriz(points, i);
            }

            if (isVert[1]) {
              Point.checkVert(points, j);
            } else {
              Point.checkHoriz(points, j);
            }

            if (isVert[2]) {
              Point.checkVert(points, k);
            } else {
              Point.checkHoriz(points, k);
            }

            if (Point.isAllChecked(points)) {
              System.out.println("1");
              return;
            } else {
              Point.clearCheckHistory(points);
            }
          }
        }
      }
    }

    System.out.println("0");
  }
}

class Point {

  int x;
  int y;
  boolean checked;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  static void clearCheckHistory(Point[] points) {
    for (Point p : points) {
      p.checked = false;
    }
  }

  static boolean isAllChecked(Point[] points) {
    boolean allChecked = true;
    for (Point p : points) {
      if (!p.checked) {
        allChecked = false;
        return false;
      }
    }
    return true;
  }

  static void checkVert(Point[] points, int x) {
    for (Point p : points) {
      if (p.x == x) {
        p.checked = true;
      }
    }
  }

  static void checkHoriz(Point[] points, int y) {
    for (Point p : points) {
      if (p.y == y) {
        p.checked = true;
      }
    }
  }
}