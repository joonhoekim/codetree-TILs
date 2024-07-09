import java.util.Scanner;

public class Main {
  public static int countDays(int m, int d) {
    int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int totalDays = 0;

    for (int i = 1; i < m; i++) {
      totalDays += days[i];
    }

    totalDays += d;

    return totalDays;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m1 = sc.nextInt();
    int d1 = sc.nextInt();
    int m2 = sc.nextInt();
    int d2 = sc.nextInt();

    String A = sc.next();

    String[] weekday = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int totalDays = countDays(m2, d2) - countDays(m1, d1);

    while (totalDays < 0) {
      totalDays += 7;
    }

    int startDayIndex = -1;
    for (int i = 0; i < weekday.length; i++) {
      if (weekday[i].equals(A)) {
        startDayIndex = i;
        break;
      }
    }

    int count = 0;
    for (int i = 0; i <= totalDays; i++) {
      if ((startDayIndex + i) % 7 == startDayIndex) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}