import com.sun.security.jgss.GSSUtil;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int count = 0;

    for (int i = X; i <= Y; i++) {
      if (interestingValidator(i)) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static boolean interestingValidator(int n) {
    int[] digit = new int[10];
    int numLength = 0;

    while (n > 0) {
      digit[n % 10]++;
      numLength++;
      n /= 10;
    }

    boolean isInteresting = false;

    for (int i : digit) {
      if (i == numLength - 1) {
        isInteresting = true;
        break;
      }
    }
    return isInteresting;
  }
}