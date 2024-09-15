import java.util.Scanner;

public class Main {
  public static int[] Ta = new int[1000];
  public static int[] Tb = new int[1000];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C = sc.nextInt();
    int G = sc.nextInt();
    int H = sc.nextInt();

    for (int i = 0; i < N; i++) {
      Ta[i] = sc.nextInt();
      Tb[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 1000; i++) {
      int sum = 0;
      for (int j = 0; j < N; j++) {
        if (i < Ta[j]) {
          sum += C;
        } else if (i > Tb[j]) {
          sum += H;
        } else {
          sum += G;
        }
      }

      max = Math.max(max, sum);
    }

    System.out.println(max);
  }
}