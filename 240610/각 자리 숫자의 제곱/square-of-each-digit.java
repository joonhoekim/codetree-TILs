import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    System.out.println(sumDigit(N));

    sc.close();
  }

  public static int sumDigit(int n) {
    if (n < 10)
      return calcSquare(n);

    return sumDigit(n/10) + calcSquare(n%10);
  }

  public static int calcSquare(int n) {
    return n*n;
  }
}