import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //여러 선분이 주어졌을 때, 겹치는 경우를 완전탐색으로 풀어내는 유형
    /*
     * 분석
     * - 선분의 겹침, '모두 겹치는지 확인 필요'
     * 설계
     * - 스위핑라인 방법 : 수평선을 배열로 두고, 선분이 지나가는 경우 원소에 해당 기록을 남기는 방식
     *   - 선분의 크기가 커지는 경우 풀 수 없음
     * - 대수적 완전탐색 방법 : 선분 끝점 값의 최댓값과 선분 시작점 값의 최솟값을 비교하여 풀이하기
     *   - 선분의 크기가 아주 크더라도 풀 수 있음
     * */

    //대수적 완전탐색 방법
    Scanner sc = new Scanner(System.in);

    //start, end 구분
    int n = sc.nextInt();
    int[][] points = new int[n][2];
    int maxX1 = Integer.MIN_VALUE;
    int minX2 = Integer.MAX_VALUE;
    

    for (int i = 0; i < n; i++) {
      //start
      points[i][0] = sc.nextInt();
      //end
      points[i][1] = sc.nextInt();
      
      maxX1 = Math.max(maxX1, points[i][0]);
      minX2 = Math.min(minX2, points[i][1]);
    }

    if (maxX1 < minX2) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }


  }

}