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

  public static int numOfDay(String s) {
    if (s.equals("Mon")) return 0;
    else if(s.equals("Tue")) return 1;
    else if(s.equals("Wed")) return 2;
    else if(s.equals("Thu")) return 3;
    else if(s.equals("Fri")) return 4;
    else if(s.equals("Sat")) return 5;
    return 6;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m1 = sc.nextInt();
    int d1 = sc.nextInt();
    int m2 = sc.nextInt();
    int d2 = sc.nextInt();

    String A = sc.next();

    int startDate =  countDays(m1, d1);
    int endDate = countDays(m2, d2);

    int startDayIndex = numOfDay("Mon");

    int count = 0;

    for(int date = startDate; date <= endDate; date++) {
      if(startDayIndex == numOfDay(A)) {
        count++;
      }
      startDayIndex = (startDayIndex + 1) % 7;
    }

    System.out.println(count);
  }
}