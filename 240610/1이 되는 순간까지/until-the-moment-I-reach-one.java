import java.util.Scanner;

public class Main {

  public static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    System.out.println(divideNumber(N));

    sc.close();
  }

  public static int divideNumber(int n) {

    if (n == 1)
      return count;

    if (n % 2 == 0) {
      count++;
      return divideNumber(n/2);
    } else {
      count++;
      return divideNumber(n/3);
    }
  }
}