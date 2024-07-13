import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String N = sc.next();

    System.out.println(nConverter(N));
  }


  public static String nConverter(String n) {
    int[] digits = new int[30];
    int num = 0;
    int count = 0;

    for (int i = 0; i < n.length(); i++) {
      num = num * 2 + Integer.parseInt(String.valueOf(n.charAt(i)));
    }

    num *= 17;

    while (true) {

      if (num < 2) {
        digits[count++] = num;
        break;
      }

      digits[count++] = num % 2;
      num = num / 2;
    }

    StringBuffer result = new StringBuffer();

    for (int i = count-1; i >= 0; i--) {
      result.append(digits[i]);
    }

    return new String(result);
  }
}