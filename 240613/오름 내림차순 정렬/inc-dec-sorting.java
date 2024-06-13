import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];


    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // 메서드 체인+람다 함수가 적용됨, Integer[]로 변환
    Integer[] descArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

    Arrays.sort(arr);
    Arrays.sort(descArr, Collections.reverseOrder());

    for (int value : arr) {
      System.out.printf("%d ", value);
    }
    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", descArr[i]);
    }

    sc.close();
  }
}