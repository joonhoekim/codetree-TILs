import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String Binary = sc.next();
    int num = 0;

    for (int i = 0; i < Binary.length(); i++) {
      num = num * 2 + Integer.parseInt(String.valueOf(Binary.charAt(i))) ;
    }

    System.out.println(num);
  }
}