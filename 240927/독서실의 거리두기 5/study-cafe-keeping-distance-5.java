import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    sc.nextLine();
    char[] seats = sc.nextLine().toCharArray();

    int answer = Integer.MIN_VALUE;

    for (int i = 0; i < N; i++) {
      if (seats[i] == '1') {
        continue;
      }

      char[] newSeats = Arrays.copyOf(seats, N);
      newSeats[i] = '1';

      int closest = Integer.MAX_VALUE;
      int distance = 0;
      boolean isCounting = false;

      for (int j = 0; j < N; j++) {
        if (newSeats[j] == '1') {
          if (isCounting) {
            closest = Math.min(distance, closest);
          }
          distance = 0;
          isCounting = true;
        }
        distance++;
      }

      answer = Math.max(closest, answer);
    }
    System.out.println(answer);
  }
}