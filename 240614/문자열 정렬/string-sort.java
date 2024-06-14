import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    char[] strArr = str.toCharArray();
    Arrays.sort(strArr);

    for (char c : strArr) {
      System.out.print(c);
    }
    sc.close();
  }
}