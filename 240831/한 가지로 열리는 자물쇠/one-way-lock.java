import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] password = new int[3];

    for (int i = 0;  i < 3; i++) {
      password[i] = sc.nextInt();
    }

    int count = 0;

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        for (int k = 1; k <= N; k++) {
          int a = Math.abs(password[0]-i);
          int b = Math.abs(password[1]-j);
          int c = Math.abs(password[2]-k);
          if (a <= 2 || b <= 2 || c <= 2) {
            count++;
          }
        }
      }
    }

    System.out.println(count);
  }
}