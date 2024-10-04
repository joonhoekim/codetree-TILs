import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static int MAX_N = 100;
  public static int[] bombs = new int[MAX_N];
  public static boolean[] isExploded = new boolean[MAX_N];

  public static Map<Integer, Integer> countMap = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      bombs[i] = sc.nextInt();
    }
    int max = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= i+K; j++) {
        if (bombs[i] == bombs[j]) {
          if (!isExploded[i]) {
            countMap.put(i, countMap.getOrDefault(i, 0)+1);
          }
          if (!isExploded[j]) {
            countMap.put(i, countMap.getOrDefault(j, 0) + 1);
          }
          
          isExploded[i] = true;
          isExploded[j] = true;
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
          if (entry.getValue() > max) {
            max = entry.getValue();
          }
        }
      }
    }
    System.out.println(max);
  }
}