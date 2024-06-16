import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String word1 = sc.nextLine();
    String word2 = sc.nextLine();

    if (sortFilter(word1).equals(sortFilter(word2))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

  public static String sortFilter(String str) {
    char[] arr = str.toCharArray();

    Arrays.sort(arr);

    return new String(arr);
  }
}