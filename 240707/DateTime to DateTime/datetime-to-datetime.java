import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int day = 11;
    int hour = 11;
    int min = 11;

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int elapsedMinutes = isBefore(a, b, c);

    if (elapsedMinutes != -1) {
      while (day != a || hour != b || min != c) {

        min++;
        elapsedMinutes++;

        if (min == 60) {
          hour++;
          min = 0;
        }

        if (hour == 24) {
          day++;
          hour = 0;
        }
      }
    }

    System.out.println(elapsedMinutes);
  }
  public static int isBefore(int a, int b, int c) {
    if (a < 11) {
      return -1;
    } else {
      if (b < 11) {
        return -1;
      } else {
        if (c < 11) {
          return -1;
        }
      }
    }
    return 0;
  }

}