import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] cowsHeight = new int[N];

    for (int i = 0; i < N; i++) {
      cowsHeight[i] = sc.nextInt();
    }

    int count = 0;

    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        for (int k = j+1; k < N; k++) {
          if (cowsHeight[i] < cowsHeight[j] && cowsHeight[j] < cowsHeight[k]) {
            count++;
          }
        }
      }
    }

    System.out.println(count);
  }
}