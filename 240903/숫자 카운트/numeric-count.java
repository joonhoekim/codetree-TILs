import java.util.Scanner;

public class Main {
  public static String[] queries;
  public static int[] count1;
  public static int[] count2;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    queries = new String[N];
    count1 = new int[N];
    count2 = new int[N];

    for (int i = 0; i < N; i++) {
      queries[i] = sc.next();
      count1[i] = sc.nextInt();
      count2[i] = sc.nextInt();
    }

    int result = 0;

    for (int i = 111; i < 1000; i++) {
      if(isValidNumber(i) && isMeet(i, N)) {
        result++;
      }
    }

    System.out.println(result);
  }

  public static boolean isMeet(int q, int N) {
    for (int i = 0; i < N; i++) {
      int numCount1 = 0;
      int numCount2 = 0;

      char[] arr = queries[i].toCharArray();

      int[] degree = new int[3];
      degree[0] = q / 100;
      degree[1] = (q / 10) % 10;
      degree[2] = q % 10;

      for (int j = 0; j < 3; j++) {
        if (degree[j] == arr[j] - '0') {
          numCount1++;
        } else if (queries[i].indexOf(degree[j] + '0') != -1) {
          numCount2++;
        }
      }

      if (numCount1 != count1[i] || numCount2 != count2[i]) {
        return false;
      }
    }

    return true;
  }

  public static boolean isValidNumber(int num) {
    int a = num / 100;
    int b = (num / 10) % 10;
    int c = num % 10;

    return (a != b && b != c && a != c && a != 0 && b != 0 && c != 0);
  }
}