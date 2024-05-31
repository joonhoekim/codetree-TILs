import java.util.Scanner;

public class Main {
  public static Boolean is369(int m) {
    String str = Integer.toString(m);

    return str.contains("3") || str.contains("6") || str.contains("9");
  }

  public static Boolean isTrue(int n) {
    return n % 3 == 0 || is369(n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int count = 0;

    for (int i = a; i <= b; i++) {
      if (isTrue(i)) {
        count++;
      }
    }
    System.out.println(count);
  }
}