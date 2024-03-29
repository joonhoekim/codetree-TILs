import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getAns(n));
    }

    static int getAns(int n) {
        if(n==1) {
            return 2;
        }
        if(n==2) {
            return 4;
        }
        return (getAns(n-2) * getAns(n-1)) % 100;
    }
}