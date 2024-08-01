import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 세 사람의 위치를 숫자로 표현함
    // 이 세사람이 연달아서 (공차1) 서있게 하고 싶음
    // 가운데 사람은 움직일 수 없음, 양 끝만 이동할 수 있음.
    // 양 끝 사람은, '남은 두 사람 사이'로만 이동할 수 있음.
    // 이동 비용은 고려하지 않음. 이동 횟수만 고려함. 최대 이동거리같은 제약은 없음.
    // 위치는 1~10억까지이므로 int 사용해도 됨

    // 설계
    // 두 사람 사이로 이동할 때 한 칸을 비워놔야 완성됨

    // 케이스
    // 1 3 5 -> 1 2 3
    // 1 2 10 -> 2 4 10 -> 2 3 4
    // 1 9 10 -> 1 3 9 -> 1 2 3

    // 가까운 숫자간 차이를 구하는데,
    // 1 차이나는 것이
    //   - 0개 있으면 2회
    //   - 1개 있으면 1회
    //   - 2개 있으면 0회

    Scanner sc = new Scanner(System.in);
    int n = 3;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    // 공차 1인 경우 개수찾기
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i + 1] - arr[i] == 1) {
        count++;
      }
    }

    System.out.println(2 - count);


  }
}