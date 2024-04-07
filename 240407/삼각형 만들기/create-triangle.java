import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] xy = new int[n][2];
    for (int i = 0; i < n; i++) {
      xy[i][0] = sc.nextInt();
      xy[i][1] = sc.nextInt();
    }

    //renew max
    int maxArea = Integer.MIN_VALUE;

    //pick three xy points
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          int[][] picked = new int[3][2];
          picked[0] = xy[i];
          picked[1] = xy[j];
          picked[2] = xy[k];

          //check x-parallel y-parallel
          boolean[] parallel = new boolean[2];
          for (int first = 0; first < 3 - 1; first++) {
            for (int second = first + 1; second < 3; second++) {
              //call by ref
              checkXparallel(xy, first, second, parallel);
              checkYparallel(xy, first, second, parallel);
            }
          }

          if (parallel[0] && parallel[1]) {
            maxArea = Math.max(maxArea, getArea(picked));
          }
        }

      }
    }
    System.out.println(maxArea);
  }

  private static int getArea(int[][] p) {
    return p[0][0] * p[1][1] + p[1][0] * p[2][1] + p[2][0] * p[0][1] - p[1][0] * p[0][1] - p[2][0] * p[1][1]
        - p[0][0] * p[2][1];
  }

  private static void checkYparallel(int[][] xy, int first, int second, boolean[] parallel) {
    if (xy[first][0] == xy[second][0]) {
      parallel[1] = true;
    }
  }

  private static void checkXparallel(int[][] xy, int first, int second, boolean[] parallel) {
    if (xy[first][1] == xy[second][1]) {
      parallel[0] = true;
    }
  }
}