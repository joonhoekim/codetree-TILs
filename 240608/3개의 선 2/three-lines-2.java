import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {
  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Point> points = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      points.add(new Point(x, y));
    }

    System.out.println(canCoverAllPointsWithThreeLines(points) ? 1 : 0);
  }

  private static boolean canCoverAllPointsWithThreeLines(List<Point> points) {
    for (int i = 0; i <= 10; i++) {
      for (int j = 0; j <= 10; j++) {
        if (i != j) {
          for (int k = 0; k <= 10; k++) {
            if (k != i && k != j) {
              if (canCoverWithLines(points, i, j, k, 3, 0)) {
                return true;
              }
              if (canCoverWithLines(points, i, j, k, 2, 1)) {
                return true;
              }
              if (canCoverWithLines(points, i, j, k, 1, 2)) {
                return true;
              }
              if (canCoverWithLines(points, i, j, k, 0, 3)) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }

  private static boolean canCoverWithLines(List<Point> points, int x1, int x2, int y1, int numVerticalLines, int numHorizontalLines) {
    for (Point p : points) {
      boolean isOnVerticalLine = false;
      boolean isOnHorizontalLine = false;

      if (numVerticalLines == 2) {
        isOnVerticalLine = p.x == x1 || p.x == x2;
      } else if (numVerticalLines == 1) {
        isOnVerticalLine = p.x == x1 || p.x == x2;
      }

      if (numHorizontalLines == 1) {
        isOnHorizontalLine = p.y == y1;
      }

      if (!isOnVerticalLine && !isOnHorizontalLine) {
        return false;
      }
    }
    return true;
  }
}