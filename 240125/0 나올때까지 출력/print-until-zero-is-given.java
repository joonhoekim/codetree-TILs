import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (; ; ) {
      int i = 0;
      if ((i = sc.nextInt()) == 0) {
        break;
      }
      System.out.println(i);
    }

  }
}