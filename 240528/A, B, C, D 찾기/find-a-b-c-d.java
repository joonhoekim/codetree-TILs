import java.util.Arrays;
import java.util.Scanner;

// 모수 4개 구하기 (a, b, c, d)
// 범위: abcd 다 더해도 최대 10억이므로 int 사용 가능
// 들어오는 입력값은 15개
// C ≤ A + B 이므로 작은 순으로 a, b, c가 나오고
// 제일 큰 것에서 a+b+c 빼면 d 나온다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }

        Arrays.sort(inputs);

        int a = inputs[0];
        int b = inputs[1];
        int c = inputs[2];
        int d = inputs[inputs.length - 1] - a - b - c;
        System.out.printf("%d %d %d %d", a, b, c, d);
    }
}