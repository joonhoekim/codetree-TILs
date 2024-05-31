import java.util.Scanner;

public class Main {

  public static Boolean isSum(int n) {
    if (n == 100) {
      return false;
    } else if (n >= 10) {
      return (n / 10 + n % 10) % 2 == 0;
    } else {
      return n % 2 == 0;
    }
  }


  public static Boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return isSum(n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;

    for (int i = a; i <= b; i++) {
      if (isPrime(i)) {
        count++;
      }
    }

    System.out.println(count);
    sc.close();
  }
}