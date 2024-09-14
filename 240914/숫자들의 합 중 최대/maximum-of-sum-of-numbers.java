import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int Y = sc.nextInt();

    int result = 0;

    for (int i = X; i <= Y; i++) {
      result = Math.max(result, getDigit(i));
    }

    System.out.println(result);
  }

  public static int getDigit(int n) {
    if (n < 10) {
      return n;
    } else {
      return getDigit(n / 10) + (n % 10);
    }
  }
}