import java.util.Scanner;

public class Main {
  public static String isTrue(int n) {
    return n % 2 == 0 && (n/10 + n%10) % 5 == 0 ? "Yes" : "No";
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    System.out.println(isTrue(n));
  }
}