import java.util.Scanner;

public class Main {

  static int[] start = new int[100];
  static int[] end = new int[100];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // A와 B를 start와 end로 나누어 배열에 저장
    for (int i = 0; i < N; i++) {
      start[i] = sc.nextInt();
      end[i] = sc.nextInt();
    }

    // 시간 계산
    int maxTime = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      int[] workTime = new int[1000];
      int operatingTime = 0;
      
      for (int j = 0; j < N; j++) {
        // i(개발자 한명)를 제외한 나머지 운행 시간을 계산
        if (i != j) {
          int A = start[j];
          int B = end[j];
          for (int k = A; k < B; k++) {
            workTime[k]++;
          }
        }
      }
      
      // 총 운행 시간 계산
      for (int j = 1; j < 10; j++) {
        if (workTime[j] >= 1) {
          operatingTime++;
        }
      }

      maxTime = Math.max(maxTime, operatingTime);
    }

    System.out.println(maxTime);
  }
}