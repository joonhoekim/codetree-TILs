import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int given = sc.nextInt();
    for (int i = 1; i <= given; i++) {
      //multiple of 3
      if (i % 3 == 0) {
        System.out.print("0 ");
      }
      //contains 3
      else if ((i + 7) % 10 == 0) {
        System.out.print("0 ");
      } else {
        System.out.print(i + " ");
      }


    }


  }
}