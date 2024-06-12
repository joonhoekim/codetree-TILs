import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    System.out.println(findIndexValue(N));

    sc.close();
  }

  public static int findIndexValue(int n) {
    if (n == 1) {
      return 2;
    }
    if (n == 2) {
      return 4;
    }

    return findIndexValue(n-1) * findIndexValue(n-2) % 100;
  }
}