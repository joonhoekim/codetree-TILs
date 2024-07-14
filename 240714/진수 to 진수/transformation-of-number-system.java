import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    String n = sc.next();

    System.out.println(nConverter(n, a, b));
  }

  public static String nConverter(String n, int a, int b) {
    char[] nCharArray = n.toCharArray();
    int decimal = 0;
    int count = 0;
    int[] digits = new int[30];

    StringBuffer result = new StringBuffer();

    for (char c : nCharArray) {
      decimal = decimal * a + Integer.parseInt(String.valueOf(c));
    }


    while (true) {
      if (decimal < b) {
        digits[count++] = decimal;
        break;
      }
      digits[count++] = decimal % b;
      decimal /= b;
    }

    for (int i = count-1; i >= 0; i--) {
      result.append(digits[i]);
    }

    return new String(result);
  }
}