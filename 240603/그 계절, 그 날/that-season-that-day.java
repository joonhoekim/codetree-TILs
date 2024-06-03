import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int Y = sc.nextInt();
    int M = sc.nextInt();
    int D = sc.nextInt();

    if (dateValidator(Y, M, D).equals("N")) {
      System.out.println(-1);
    } else {
      System.out.println(dateValidator(Y,M,D));
    }

    sc.close();
  }

  public static int[] isLeapYear(int Y) {
    int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] commonYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (Y % 4 == 0) {
      if (Y % 100 == 0) {
        if (Y % 400 == 0) {
          return leapYear;
        } else {
          return commonYear;
        }
      } else {
        return leapYear;
      }
    }
    return commonYear;
  }

  public static String dateValidator(int Y, int M, int D) {
    int[] lastDays = isLeapYear(Y);

    if (M > 12) {
     return "N";
    } else if (lastDays[M-1] < D) {
      return "N";
    }
    return formatSeason(M);
  }

  public static String formatSeason(int M) {
    if (M >= 3 && M < 6){
      return "Spring";
    } else if (M >= 6 && M <9) {
      return "Summer";
    } else if (M >= 9 && M <= 11) {
      return "Fall";
    } else {
      return "Winter";
    }
  }
}