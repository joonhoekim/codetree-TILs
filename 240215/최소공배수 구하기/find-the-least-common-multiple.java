import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        System.out.print(getGCD(n,m));
    }

    static int getGCD(int n, int m) {
        int smaller = n>m?m:n;
        for(int i=smaller; i<=n*m; i++) {
            if(i%n==0 && i%m==0) {
                return i;
            }
        }
        return -1;
    }
}