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
    int maxArea = 0; //no triangle that can make area, return 0

    //pick three xy points
    for (int i = 0; i < n - 2; i++) {
      for (int j = 1; j < n - 1; j++) {
        for (int k = 2; k < n; k++) {
          int[][] picked = new int[3][2];
          picked[0] = xy[i];
          picked[1] = xy[j];
          picked[2] = xy[k];

          //check x-parallel y-parallel
          boolean[] parallel = new boolean[2];
          for (int first = 0; first < 3 - 1; first++) {
            for (int second = first + 1; second < 3; second++) {
              //call by ref
              checkXparallel(picked, first, second, parallel);
              checkYparallel(picked, first, second, parallel);
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
    int doubledArea = 0;
    //Gauss's polygon area theorem (also called shoelace theorem)
    for (int i = 0; i < p.length; i++) {
      int next = (i + 1) % p.length;
      doubledArea += p[i][0] * p[next][1] - p[i][1] * p[next][0];
    }

    return doubledArea;
  }

  private static void checkXparallel(int[][] picked, int first, int second, boolean[] parallel) {
    if (picked[first][1] == picked[second][1]) {
      parallel[0] = true;
    }
  }

  private static void checkYparallel(int[][] picked, int first, int second, boolean[] parallel) {
    if (picked[first][0] == picked[second][0]) {
      parallel[1] = true;
    }
  }

}