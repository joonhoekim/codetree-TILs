import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }
    static int count = 0;
    static int f(int n) {
        if(n==1) {
            return count;
        }
        if(n%2==0) {
            n /=2;
        } else {
            n /=3;
        }
        count++;
        return f(n);
    }
}