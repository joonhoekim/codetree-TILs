import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] developers = new int[6];
    int total = 0;
    for (int i = 0; i < 6; i++) {
      developers[i] = sc.nextInt();
      total += developers[i];
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < 6; i++) {
      for (int j = i+1; j < 6; j++) {
        for (int k = j+1; k < 6; k++) {
          int group1 = developers[i] + developers[j] + developers[k];
          int group2 = total - group1;
          min = Math.min(min, Math.abs(group1-group2));
        }
      }
    }
    System.out.println(min);
  }
}