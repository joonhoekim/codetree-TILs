import java.util.Scanner;

public class Main {
  public static int countDays(int m, int d) {
    int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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


    String[] weekday = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int subtractDays = countDays(m2, d2) - countDays(m1 , d1);

    while (subtractDays < 0) {
      subtractDays += 7;
    }

    System.out.println(weekday[subtractDays % 7]);



  }
}