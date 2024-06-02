//문제: 특정 범위 안에 같은 번호의 폭탄이 있다면 그 폭탄 둘은 폭발한다.
//접근: 모든 폭탄에 대해, 폭발 여부를 검사해보고, 폭발할 경우 가장 큰 폭탄 넘버를 갱신한다.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int boomCount = sc.nextInt();
    int activeRange = sc.nextInt();

    //idx = position, value = boomNo
    int[] boomPositions = new int[boomCount];
    for (int i = 0; i < boomCount; i++) {
      boomPositions[i] = sc.nextInt();
    }

    int boomNoMax = -1;
    //제일 효율적인 방법은 액티브레인지 안에 있는 것만 검사하는 것인데, 일단 편하게 구현..
    for (int boomIdx1 = 0; boomIdx1 < boomCount; boomIdx1++) {
      for (int boomIdx2 = 0; boomIdx2 < boomCount; boomIdx2++) {
        if(boomIdx1 == boomIdx2) continue;
        boolean isInRange = Math.abs(boomIdx1 - boomIdx2) <= activeRange;
        if (!isInRange) {
          continue;
        }
        if (boomPositions[boomIdx1] == boomPositions[boomIdx2]) {
          boomNoMax = Math.max(boomNoMax, boomPositions[boomIdx2]);
          break;
        }

      }
    }

    System.out.println(boomNoMax);
  }
}