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

    int area = 0;

    // i, j, k에 해당하는 점을 고른다.
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        for (int k = j+1; k < N; k++) {
          if (xArr[i] == xArr[j] || xArr[i] == xArr[k] || xArr[j] == xArr[k] &&
              yArr[i] == yArr[j] || yArr[i] == yArr[k] || yArr[j] == yArr[k]) {
            int xLength = getMax(xArr[i], xArr[j], xArr[k]) - getMin(xArr[i], xArr[j], xArr[k]);
            int yLength = getMax(yArr[i], yArr[j], yArr[k]) - getMin(yArr[i], yArr[j], yArr[k]);

            area = Math.max(area, xLength * yLength);
          }
        }
      }
    }

    System.out.println(area);
  }
  public static int getMax(int n, int m, int o) {
    int max = Math.max(n, m);
    return Math.max(max, o);
  }

  public static int getMin(int n, int m, int o) {
    int min = Math.min(n, m);
    return Math.min(min, o);
  }
}