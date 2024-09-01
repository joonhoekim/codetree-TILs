import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] devolopers = new int[6];
    int total = 0;
    for (int i = 0; i < 6; i++) {
      devolopers[i] = sc.nextInt();
      total += devolopers[i];
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < 4; i++) {
      for (int j = 1; j < 5; j++) {
        for (int k = 2; k < 6; k++) {
          int group1 = devolopers[i] + devolopers[j] + devolopers[k];
          int group2 = total - group1;
          min = Math.min(min, Math.abs(group1-group2));
        }
      }
    }
    System.out.println(min);
  }
}