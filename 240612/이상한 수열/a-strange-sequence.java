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
      return 1;
    }
    if (n == 2) {
      return 2;
    }

    return findIndexValue(n/3) + findIndexValue(n-1);
  }

}