import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double divided = (double) a / b;
        System.out.printf("%.20f",divided);
    }
}