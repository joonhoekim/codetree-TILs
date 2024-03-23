import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }

    static int f(int n) {
        if(n==1) {
            return 0;
        }
        if(n%2==0) {
            n /=2;
        } else {
            n /=3;
        }
        return f(n)+1;
    }
}