import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //a, b, c, a+b, b+c, c+a, a+b+c 를 랜덤하게 알려줄테니
    //a, b, c를 구해봐라 (a<=b<=c)
    //제일 작은 숫자 둘이 a, b 가 될거고, 제일 큰 거에서 빼면 c가 될 것

    Scanner sc = new Scanner(System.in);
    String[] inputs = sc.nextLine().split(" ");
    int[] arr = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      arr[i] = Integer.parseInt(inputs[i]);
    }

    Arrays.sort(arr);
    int a = arr[0];
    int b = arr[1];
    int c = arr[arr.length - 1] - a - b;
    System.out.printf("%d %d %d", a, b, c);

  }
}