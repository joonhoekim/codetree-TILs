import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getSumOfEvenOrOdd(n));
    }

    static int getSumOfEvenOrOdd(int n) {
        if(n<=0) {
            return 0;
        }
        return n+getSumOfEvenOrOdd(n-2);
    }
}