import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    int multiple = n1*n2*n3;

    System.out.println(sumDigitNumber(multiple));

    sc.close();
  }

  public static int sumDigitNumber(int n) {
    if (n < 10)
      return n;

    return sumDigitNumber(n / 10) + n % 10;
  }



}