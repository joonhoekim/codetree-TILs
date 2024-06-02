import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int D = sc.nextInt();

    if (dateValidator(M, D)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static Boolean dateValidator(int M, int D) {
    Boolean isValid = true;
    if (M == 2) {
      if (D > 28) {
        isValid = false;
      }
    }
    if (M % 2 != 0) {
      if (D > 31) {
        isValid = false;
      }
    } else if (M % 2 == 0) {
      if (D > 30) {
        isValid = false;
      }
    }
    return isValid;
  }
}