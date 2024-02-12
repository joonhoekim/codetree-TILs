import java.util.Scanner;

public class Main {

    static int getGcd(int n, int m){ //gcd is greatest common divider
        int smaller = Math.min(n,m);//n>m?m:n;
        for(int i=smaller; i>=1; i--) {
            if(n%i==0 && m%i==0) {
                return i;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(getGcd(n,m));
    }    
}