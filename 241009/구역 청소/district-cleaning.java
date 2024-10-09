import java.util.Scanner;

public class Main {
  public static int MAX_RANGE = 101;
  public static int[] area = new int[MAX_RANGE];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    cleaning(a, b);
    cleaning(c, d);

    int answer = 0;
    for (int i = 0; i < MAX_RANGE; i++) {
      if (area[i] > 0) {
        answer++;
      }
    }

    System.out.println(answer);
  }

  public static void cleaning(int a, int b) {
    for (int i = a; i < b; i++) {
      area[i]++;
    }
  }
}