import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    System.out.println(sumIf(N));

    sc.close();
  }

  public static int sumIf(int n) {

    if (n % 2 == 0) {
      if (n == 2)
        return 2;

      return sumIf(n-2) + n;
    } else {
      if (n == 1)
        return 1;

      return sumIf(n-2) + n;
    }
  }

}