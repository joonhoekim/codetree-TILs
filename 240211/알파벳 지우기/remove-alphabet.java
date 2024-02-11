import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    String numStr1 = extractNumbers(str1);
    String numStr2 = extractNumbers(str2);

    int sum = Integer.parseInt(numStr1) + Integer.parseInt(numStr2);
    System.out.print(sum);
  }

  public static String extractNumbers(String str) {
    StringBuilder sb = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}