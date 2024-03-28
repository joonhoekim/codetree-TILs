import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(getAns(n));
    }

    static int getAns(int n) {
        if(n==1) {
            return 0;
        }
        int arg = n%2==0 ? n/2 : 3*n + 1;
        return 1 + getAns(arg);
    }
}