import java.util.Scanner;

public class Main {

  public static char[] arr = new char[1000];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int T = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < T; i++) {
      char c = sc.next().charAt(0);
      int x = sc.nextInt();
      arr[x] = c;
    }

    int count = 0;
    for (int k = a; k <= b; k++) {
      int d1 = Integer.MAX_VALUE;
      int d2 = Integer.MAX_VALUE;
      for (int i = 0; i < 1000; i++) {
        for (int j = 0; j < 1000; j++) {
          if (arr[i] == 'S' && arr[j] == 'N') {
            d1 = Math.min(d1, Math.abs(k-i));
            d2 = Math.min(d2, Math.abs(k-j));
          }
        }
      }
      if(d1 <= d2) {
        count++;
      }
    }
    System.out.println(count);
  }
}