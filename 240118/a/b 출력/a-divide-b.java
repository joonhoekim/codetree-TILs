import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int given = sc.nextInt(), devider = sc.nextInt();

    //처음에 이게 왜 반복문 문제인가 했는데, 부동소수점 정확도 때문에 반복문 문제가 맞았음!!
    //아래는 내가 제출했던 대표적인 오답.
    //double divided = (double) a / (double) b; (코드 다시 작성하면서 변수 네이밍은 수학에 맞게 바꿨음)
    //System.out.printf("%.20f",divided);
    //double 타입은 15자리수까지만 정확도 보장 가능하다! float는 7자리고.
    //그래서 정수 나눗셈을 직접 구현해야 함!

    int quotient = given / devider;
    int residue = given % devider;
    System.out.print(quotient + ".");
    for (int i = 0; i < 20; i++) {
      quotient = (residue * 10) / devider;
      residue = (residue * 10) % devider;
      //효율적이지 않을지라도 수학에서 하는 방법을 그대로 구현해봤다.
      System.out.print(quotient);
    }


  }
}