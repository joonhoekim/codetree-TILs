import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    char[] place = new char[10001];

    for (int i = 0; i < N; i++) {
      int p = sc.nextInt();
      place[p] = sc.next().charAt(0);
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < place.length-K; i++) {
      int sum = 0;
      for (int j = i; j <= i+K; j++) {
        sum += getScore(place[j]);
      }
      max = Math.max(max, sum);
    }

    System.out.println(max);
  }

  public static int getScore(char c) {
    if (c == 'G') {
      return 1;
    } else if (c == 'H') {
      return 2;
    }
    return 0;  // 'G'도 'H'도 아닌 경우 (초기값)
  }
}