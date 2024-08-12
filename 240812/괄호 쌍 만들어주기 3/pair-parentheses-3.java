import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.next();

    char[] arr = A.toCharArray();
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] == '(' && arr[j] == ')') {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}