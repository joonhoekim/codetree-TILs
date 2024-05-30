import java.util.Scanner;

public class Main {

  public static void calcMultiple(int n, int m) {
    int min = Math.min(n, m);
    int max = Math.max(n, m);

    for (int i = max; i <= max*min; i++) {
      if (i % max == 0 && i % min == 0) {
        System.out.println(i);
        break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    calcMultiple(n, m);

    sc.close();
  }
}