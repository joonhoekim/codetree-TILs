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
      //contains 3, 6, 9 (일의 자리수)
      else if ((i + 7) % 10 == 0) {
        System.out.print("0 ");
      } else if ((i + 4) % 10 == 0) {
        System.out.print("0 ");
      } else if ((i + 1) % 10 == 0) {
        System.out.print("0 ");
      } //contains 3, 6, 9 (10의 자리수)
      else if ((i - 30) / 10 == 0) {
        System.out.print("0 ");
      } else if ((i - 60) / 10 == 0) {
        System.out.print("0 ");
      } else if ((i - 90) / 10 == 0) {
        System.out.print("0 ");
      }
      //그 외
      else {
        System.out.print(i + " ");
      }


    }


  }
}