import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
  static int[] arr = new int[10];

  public static int gcd(int a, int b) {
    //유클리드 알고리즘은 시뮬레이션보다 빠름 O(log n)
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static int lcm(int a, int b) {
    //수학적 방법으로 lcm 구함
    return (a * b) / gcd(a, b);
  }

  //여러 수의 LCM을 구하는데 재귀함수 적용함
  public static int recursiveLcm(int[] arr, int start, int end) {
    if (start == end) {
      return arr[start];
    } else {
      return lcm(arr[start], recursiveLcm(arr, start + 1, end));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    // 여러 수의 최대공배수를 구함
    int result = recursiveLcm(arr, 0, n - 1);
    System.out.println(result);
  }
}