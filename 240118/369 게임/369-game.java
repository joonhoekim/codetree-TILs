import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int given = sc.nextInt();

    for (int i = 1; i <= given; i++) {

      if (i % 3 == 0) {
        sb.append("0 ");
      } else if (String.valueOf(i).contains("3")
          || String.valueOf(i).contains("6")
          || String.valueOf(i).contains("9")) {
        sb.append("0 ");
      } else {
        sb.append(i + " ");
      }
    }
    System.out.print(sb);
  }
}