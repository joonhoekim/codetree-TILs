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

    // 입력
    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      bombs[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j <= i + K && j < N; j++) {  
        if (bombs[i] == bombs[j]) {
          if (!isExploded[i]) {
            countMap.put(bombs[i], countMap.getOrDefault(bombs[i], 0) + 1);
            isExploded[i] = true;  
          }
          if (!isExploded[j]) {
            countMap.put(bombs[j], countMap.getOrDefault(bombs[j], 0) + 1);
            isExploded[j] = true;  
          }
        }
      }
    }

    int maxCount = 0;
    int maxNo = 0;

    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxNo = entry.getKey();
      } else if (entry.getValue() == maxCount) {
        maxNo = Math.max(maxNo, entry.getKey());  
      }
    }

    if (maxCount == 0) {
      System.out.println(0);
    } else {
      System.out.println(maxNo);
    }

    sc.close();
  }
}