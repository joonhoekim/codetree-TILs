import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Please write your code here.
    Scanner sc = new Scanner(System.in);
    char input = sc.next().charAt(0);

    if(input == 'S') {
      System.out.println("Superior");
    } else if (input == 'A') {
      System.out.println("Good");
    } else if (input == 'B') {
      System.out.println("Good");
    } else if (input == 'C') {
      System.out.println("Usually");
    } else if (input == 'D') {
      System.out.println("Effort");
    } else {
      System.out.println("Failure");
    }
  }
}