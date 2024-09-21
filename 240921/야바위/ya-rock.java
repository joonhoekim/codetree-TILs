import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 범위 입력
    int N = sc.nextInt();
    int[] arrA = new int[MAX_N];
    int[] arrB = new int[MAX_N];
    int[] arrC = new int[MAX_N];

    for (int i = 0; i < N; i++) {
      arrA[i] = sc.nextInt();
      arrB[i] = sc.nextInt();
      arrC[i] = sc.nextInt();
    }

    int answer = 0;
    for (int i = 0; i < 3; i++) {

      int[] cups = new int[3];
      cups[i] = 1;
      int count = 0;
      for (int j = 0; j < N; j++) {
        int a = arrA[j]-1;
        int b = arrB[j]-1;
        int c = arrC[j]-1;

        int temp = cups[a];
        cups[a] = cups[b];
        cups[b] = temp;

        if (cups[c] == 1) {
          count++;
        }
      }
      answer = Math.max(answer, count);
    }

    System.out.println(answer);
  }
}