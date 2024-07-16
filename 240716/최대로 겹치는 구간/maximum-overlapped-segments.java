import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] area = new int[201];
    for (int i = 0; i < n; i++) {
      int x1 = sc.nextInt()+100;
      int x2 = sc.nextInt()+100;

      for (int j = x1; j < x2; j++) {
        area[j]++;
      }
    }
    int maxArea = Integer.MIN_VALUE;

    for (int a : area) {
      if (a > maxArea) {
        maxArea = a;
      }
    }

    System.out.println(maxArea);
  }
}