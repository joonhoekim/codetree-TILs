import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] developers = new int[5];
    int total = 0;
    for (int i = 0; i < 5; i++) {
      developers[i] = sc.nextInt();
      total += developers[i];
    }
    int result = Integer.MAX_VALUE;
    int max;
    int min;
    boolean isExist = false;

    // i와 j는 1팀, k와 l은 2팀 나머지는 3팀으로 구분하는 방법
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          for (int l = k + 1; l < 5; l++) {
            if (i != k && i != l && j != k && j != l) {
              int team1 = developers[i] + developers[j];
              int team2 = developers[k] + developers[l];
              int team3 = total - team1 - team2;

              // 모든 팀의 능력치가 서로 다르게 팀을 묶은 경우에만 최솟값 계산
              if (team1 != team2 && team1 != team3 && team2 != team3) {
                isExist = true;
                max = Math.max(team1,team2);
                max = Math.max(max, team3);
                min = Math.min(team1, team2);
                min = Math.min(min, team3);

                result = Math.min(result, max-min);
              }
            }
          }
        }
      }
    }
    if (isExist) {
      System.out.println(result);
    } else {
      System.out.println(-1);
    }

  }
}