import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.nextLine();

    if (isDifferent(A)) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }

    sc.close();
  }

  public static Boolean isDifferent(String str) {
    char[] arr = str.toCharArray();

    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] != arr[i+1]) {
        return false;
      }
    }
    return true;
  }
}