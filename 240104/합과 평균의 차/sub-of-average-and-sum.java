import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
        int avg = sum/3;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum-avg);
    }
}