import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int result = 0;

    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++) {
        double sum = 0;
        double count = 0;
        for (int k = i; k <= j; k++) {
          sum += arr[k];
          count++;
        }
        double avg = sum/count;

        for (int l = 0; l < N; l++) {
          if (avg == arr[l]) {
            result++;
            break;
          }
        }
      }

    }

    System.out.println(result);
  }
}