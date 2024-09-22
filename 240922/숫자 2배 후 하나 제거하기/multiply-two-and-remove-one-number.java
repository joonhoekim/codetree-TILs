import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }


    int answer = Integer.MAX_VALUE;
    // 2배할 숫자 선택
    for (int i = 0; i < n; i++) {
      arr[i] *= 2; // 숫자 2배

      // 제외할 숫자 선택
      for (int j = 0; j < n; j++) {
        int[] temp = new int[n-1]; // 숫자하나를 제외한 배열을 저장할 새 배열
        
        // 숫자하나 제외하고 배열 복사
        int count = 0; // 복사할 때 사용할 인덱스
        for (int k = 0; k < n; k++) {
          if (j != k) {
            temp[count++] = arr[k];
          }
        }

        // 인접한 숫자간 합 구하기
        int sum = 0;
        for (int k = 0; k < temp.length-1; k++) {
          sum += Math.abs(temp[k]-temp[k+1]);
        }
        // 최솟값 찾기
        answer = Math.min(answer, sum);
      }

      arr[i] /= 2; // 2배한 배열값 초기화

    }
    System.out.println(answer);
  }
}