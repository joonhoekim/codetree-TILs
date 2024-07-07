import java.time.LocalDateTime;
import java.util.Date;
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
    return (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11) < 0 ? -1 : 0;
  }

}