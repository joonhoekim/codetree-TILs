import java.util.Scanner;

public class Main {

  public static Boolean isLeap(int year) {
    if (year % 4 != 0) {
      return false;
    }
    if (year % 100 == 0 && year % 400 != 0) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if (isLeap(y)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    sc.close();
  }
}