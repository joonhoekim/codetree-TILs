import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] heights = new int[n];
    int[] heightsCloned = new int[n];
    for (int i = 0; i < n; i++) {
      heights[i] = sc.nextInt();
      heightsCloned[i] = heights[i];
    }

    Arrays.sort(heightsCloned);
    int max = heightsCloned[heights.length - 1];
    int min = heightsCloned[0];

    int globalSatisfiedCount = 1;
    for (int waterHeight = min; waterHeight < max; waterHeight++) {
      int localSatisfiedCount = 0;
      boolean continuous = false;
      for (int i = 0; i < n; i++) {
        if (heights[i] > waterHeight) {
          if(!continuous) {
            localSatisfiedCount++;
            continuous = true;
          }
        } else {
          continuous = false;
        }
      }

      globalSatisfiedCount = Math.max(globalSatisfiedCount, localSatisfiedCount);
    }

    System.out.println(globalSatisfiedCount);
  }
}