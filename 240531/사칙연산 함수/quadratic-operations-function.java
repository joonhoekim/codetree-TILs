import java.util.Scanner;

public class Main {

  public static String calculator(int a, String b, int c) {
    switch (b) {
      case "+":
        return plus(a, c);
      case "-":
        return minus(a, c);
      case "*":
        return muliple(a, c);
      case "/":
        return divide(a, c);
      default:
        return "False";
    }
  }

  public static String plus(int a, int c) {
   return a + " + " + c + " = " + (a + c);
  }

  public static String minus(int a, int c) {
    return a + " - " + c + " = " + (a - c);
  }

  public static String muliple(int a, int c) {
    return a + " * " + c + " = " + (a * c);
  }

  public static String divide(int a, int c) {
    return a + " / " + c + " = " + (a / c);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    int c = sc.nextInt();

    System.out.println(calculator(a, b, c));

    sc.close();
  }
}