import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int given = sc.nextInt();
    for (int i = 1; i <= given; i++) {
      String iToString = String.valueOf(i);

      if (i % 3 == 0) {
        System.out.print("0 ");
      } else if (iToString.contains("3")
          || iToString.contains("6")
          || iToString.contains("9")) {
        System.out.print("0 ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}