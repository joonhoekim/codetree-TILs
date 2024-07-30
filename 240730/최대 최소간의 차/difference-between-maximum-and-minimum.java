import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    /*
     * 분석
     * - 수열 : n개의 수가 주어짐
     * - 각 원소 값을 변경할 수 있고 이것에는 비용이 그 diff 만큼 든다.
     * - 최대/최소간 차를 k 이하로 만드려고 할 때 최소비용 구하기
     * n = 수열 길이
     * k = 최대/최소간 차이 제한
     * |a-b| = a에서 b로 값 변경하는데 드는 비용
     * 설계
     * - 최대/최소간 차 = k 는 인풋으로 고정된 값
     * - 비용이 선형적이므로, top을 깎냐 bottom을 높이냐를 결정해서 최적해를 찾아낼 수 있음
     * - [만약 비용이 선형이 아니었다면] top / bottom 완전탐색으로 풀어내면 될 것으로 보임
     * */

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int minCount = 0;
    int maxCount = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

      //반복이 생기겠지만 나중에 리팩토링
      if (arr[i] < min) {
        min = arr[i];
        minCount = 1;
      } else if (arr[i] == min) {
        minCount++;
      } else if (arr[i] > max) {
        max = arr[i];
        maxCount = 1;
      } else if (arr[i] == max) {
        maxCount++;
      }
    }

    int cost = 0;
    while (true) {
      if (max - min <= k) {
        System.out.println(cost);
        break;
      }

      //탑을 깎아야 하는 경우
      if (minCount > maxCount) {
        for (int i = 0; i < n; i++) {
          if (arr[i] == max) {
            arr[i]--;
            cost++;
          }
        }
      }
      //바텀을 높여야 하는 경우
      else {
        for (int i = 0; i < n; i++) {
          if (arr[i] == min) {
            arr[i]++;
            cost++;
          }
        }
      }

      //min, max, count 갱신
      min = Integer.MAX_VALUE;
      max = Integer.MIN_VALUE;
      minCount = 0;
      maxCount = 0;
      for (int i = 0; i < n; i++) {
        //반복이 생기겠지만 나중에 리팩토링
        if (arr[i] < min) {
          min = arr[i];
          minCount = 1;
        } else if (arr[i] == min) {
          minCount++;
        } else if (arr[i] > max) {
          max = arr[i];
          maxCount = 1;
        } else if (arr[i] == max) {
          maxCount++;
        }
      }
    }


  }

}