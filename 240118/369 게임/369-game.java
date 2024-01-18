import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int given = sc.nextInt();
    //charAt 쓰는게 더 쉬워보이긴 하는데
    //오기 생겨서 String 클래스 안써보고 풀어봅니다.

    for (int i = 1; i <= given; i++) {
      int tensPlace = i / 10;
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
      else if ((tensPlace + 7) % 10 == 0) {
        System.out.print("0 ");
      } else if ((tensPlace + 4) % 10 == 0) {
        System.out.print("0 ");
      } else if ((tensPlace + 1) % 10 == 0) {
        System.out.print("0 ");
      }
      //그 외
      else {
        System.out.print(i + " ");
      }


    }


  }
}