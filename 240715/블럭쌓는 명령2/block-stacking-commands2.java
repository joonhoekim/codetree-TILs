import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] area = new int[n];

    for (int i = 1; i <= k; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      for (int j = A; j <= B; j++) {
        area[j-1]++;
      }
    }
    int maxBlock = Integer.MIN_VALUE;

    for (int curBlock : area) {
      if (maxBlock < curBlock) {
        maxBlock = curBlock;
      }
    }

    System.out.println(maxBlock);
  }
}