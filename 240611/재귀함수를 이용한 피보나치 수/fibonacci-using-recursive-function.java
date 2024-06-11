import java.util.Scanner;

public class Main {

  public static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    System.out.println(F(N));

    sc.close();
  }

  public static int F(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 1;

    return F(n-1) + F(n-2);
  }
}