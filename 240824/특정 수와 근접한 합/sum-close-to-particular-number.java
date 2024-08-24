import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int S = sc.nextInt();

    int[] arr = new int[N];

    int total = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
      total += arr[i];
    }
    
    int minDifference = Integer.MAX_VALUE;

    for (int i = 0; i < N-1;i++){
      for (int j = i + 1; j < N; j++) {
        int sum = total - arr[i] - arr[j];
        int difference = Math.abs(S - sum);

        if (difference < minDifference) {
          minDifference = difference;
        }
      }
    }

    System.out.println(minDifference);

  }
}