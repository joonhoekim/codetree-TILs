import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i=a; i<=b; i++) {
            if(isPrime(i) && isEven(sumOfDigit(i))) {
                count++;
            }
        }
        System.out.print(count);
    }

    static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }
        for(int i=2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int n) {
        if(n%2==0) {
            return true;
        } else {
            return false;
        }
    }

    static int sumOfDigit(int n) {
        int devider = 10;
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}