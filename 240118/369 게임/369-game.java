import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int given = sc.nextInt();

    long startTime = System.currentTimeMillis();

    for (int i = 1; i <= given; i++) {

      if (i % 3 == 0) {
        System.out.print("0 ");
      } else if (String.valueOf(i).contains("3")
          || String.valueOf(i).contains("6")
          || String.valueOf(i).contains("9")) {
        System.out.print("0 ");
      } else {
        System.out.print(i + " ");
      }
    }

    System.out.println("\n" + (System.currentTimeMillis() - startTime));
  }
}