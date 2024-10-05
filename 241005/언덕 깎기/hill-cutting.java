import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static int MAX_N = 1000;
  public static int MAX_H = 100;
  public static int[] hill = new int[MAX_N];

  public static Map<Integer, Integer> countMap = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      hill[i] = sc.nextInt();
    }

    int answer = Integer.MAX_VALUE;

    for (int i = 0; i <= MAX_H - 17; i++) {
      int cost = 0;
      for (int j = 0; j < N; j++) {

        if (hill[j] < i) {
          int x = Math.abs(i-hill[j]);
          cost += x * x;
        } else if(hill[j] > i + 17) {
          int x = Math.abs(i+17-hill[j]);
          cost += x * x;
        }

      }
      answer = Math.min(answer, cost);
    }
    System.out.println(answer);
  }
}