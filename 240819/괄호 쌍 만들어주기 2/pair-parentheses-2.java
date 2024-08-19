import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] arr = sc.next().toCharArray();

    int count = 0;
    for (int i = 0; i < arr.length-2; i++) {
      for (int j = i+2; j < arr.length-1; j++) {
        if (arr[i] == '(' && arr[i+1] == '(' && arr[j] == ')' && arr[j+1] == ')') {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}