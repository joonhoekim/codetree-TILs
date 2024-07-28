import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ExplosionCheck {
  int boomNum;
  int counter = 0;

  ExplosionCheck(int boomNum) {
    this.boomNum = boomNum;
  }

  int count() {
    return ++this.counter;
  }

  int getBoomNum() {
    return this.boomNum;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int explosiveDistance = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Map<Integer, ExplosionCheck> explosionChecks = new HashMap<>();

    for (int i = 0; i < n; i++) {
      if (!explosionChecks.containsKey(arr[i])) {
        explosionChecks.put(arr[i], new ExplosionCheck(arr[i]));
      }

      ExplosionCheck check = explosionChecks.get(arr[i]);
      boolean exploded = false;

      for (int j = i + 1; j < n; j++) {
        if (arr[j] == arr[i]) {
          if (j - i <= explosiveDistance) {
            if (!exploded) {
              check.count(); // 첫 번째 폭탄도 카운트
              exploded = true;
            }
            check.count(); // 두 번째 폭탄 카운트
          }
          break; // 같은 번호의 다음 폭탄을 찾았으므로 내부 루프 종료
        }
      }
    }

    int maxExplosions = 0;
    int maxBoomNum = 0;

    for (ExplosionCheck check : explosionChecks.values()) {
      if (check.counter > maxExplosions ||
              (check.counter == maxExplosions && check.boomNum > maxBoomNum)) {
        maxExplosions = check.counter;
        maxBoomNum = check.boomNum;
      }
    }

    System.out.println(maxBoomNum);
  }
}