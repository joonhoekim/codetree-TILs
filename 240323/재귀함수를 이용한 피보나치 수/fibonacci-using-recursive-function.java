import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getNthFibonacciSequance(n));
    }

    static int getNthFibonacciSequance(int n) {
        if(n<=2) {
            return 1;
        } else {
            n=getNthFibonacciSequance(n-1) + getNthFibonacciSequance(n-2);
        }
        return getNthFibonacciSequance(n-1) + getNthFibonacciSequance(n-2);
    }
}