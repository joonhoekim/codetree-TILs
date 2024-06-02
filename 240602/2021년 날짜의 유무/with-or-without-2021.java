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
    int[] lastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (M > 12) {
      return false;
    } else if (lastDays[M-1] < D) {
      return false;
    }

    return true;
  }
}