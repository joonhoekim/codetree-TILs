import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() + 87;
        int b = sc.nextInt() % 10;

        System.out.printf("%d\n%d",a,b);


    }
}