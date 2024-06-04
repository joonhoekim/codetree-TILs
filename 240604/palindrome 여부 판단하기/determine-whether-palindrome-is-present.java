import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.nextLine();

    System.out.println(palindrome(A));

    sc.close();
  }

  public static String palindrome(String str) {
    char[] charArr = str.toCharArray();
    int count = 0;
    for (int i = charArr.length-1; i >= 0; i--) {
      if (charArr[count] != charArr[i]) {
        return "No";
      }
      count++;
    }

    return "Yes";
  }
}