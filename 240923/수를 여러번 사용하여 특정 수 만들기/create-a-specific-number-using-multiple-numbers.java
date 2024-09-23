import java.util.Map;
import java.util.Scanner;

public class Main {
  public static int MAX_N = 1000;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int answer = Integer.MIN_VALUE;

    for (int i = 0; i <= MAX_N; i++) {
      for (int j = 0; j <= MAX_N; j++) {
        int sum = A*i + B*j;
        if (sum > C) {
          break;
        } else {
          answer = Math.max(answer, sum);
        }
      }
    }
    System.out.println(answer);
  }
}