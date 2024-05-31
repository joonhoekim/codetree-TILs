import java.util.Scanner;

public class Main {
  public static int calcSum(int N) {
    int result = 0;
    for (int i = 1; i <= N; i++) {
      result += i;
    }
    return result/10;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    System.out.println(calcSum(N));

    sc.close();
  }
}