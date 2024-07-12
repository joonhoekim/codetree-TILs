import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int B = sc.nextInt();

    int[] digits = new int[20];
    int num = N;
    int count = 0;

    while (true) {
      if (num < B) {
        digits[count++] = num;
        break;
      }

      digits[count++] = num % B;
      num = num / B;


    }
    for (int i = count-1; i >= 0; i--) {
      System.out.print(digits[i]);
    }
  }
}