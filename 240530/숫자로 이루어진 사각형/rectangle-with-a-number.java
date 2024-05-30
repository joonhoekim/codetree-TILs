import java.util.Scanner;

public class Main {

  public static void printStar(int N) {
    int count = 1;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(count++ + " ");
        if (count == 10) {
          count = 1;
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    printStar(sc.nextInt());

    sc.close();
  }
}