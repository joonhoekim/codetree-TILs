import java.util.Scanner;

public class Main {

  public static void calcDivisor(int n, int m) {
    int min = Math.min(n, m);
    int max = Math.max(n, m);

    for (int i = min; i > 0; i--) {
      if (max % i == 0 && min % i == 0) {
        System.out.println(i);
        break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    calcDivisor(n, m);

    sc.close();
  }
}