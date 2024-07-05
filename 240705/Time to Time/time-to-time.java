import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int time = 0;
    int min = b;
    int hour = a;

    while (true) {
      if (hour == c && min == d) {
        break;
      }

      time++;
      min++;

      if (min == 60) {
        hour++;
        min = 0;
      }
    }

    System.out.println(time);
  }
}