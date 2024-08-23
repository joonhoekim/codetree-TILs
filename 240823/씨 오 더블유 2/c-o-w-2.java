import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    char[] arr = sc.next().toCharArray();

    int count = 0;
    for (int i = 0; i < N-2; i++) {
      for (int j = i+1; j < N-1; j++) {
        for (int k = j+1; k < N; k++) {
         if (arr[i] == 'C' && arr[j] == 'O' && arr[k] == 'W') {
           count++;
         }
        }
      }
    }

    System.out.println(count);
  }
}