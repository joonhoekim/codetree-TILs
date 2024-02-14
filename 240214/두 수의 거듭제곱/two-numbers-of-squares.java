import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(power(a,b));
    }

    static int power(int a, int b) {
        //b>=1 이므로..
        int ans=1;
        for(int i=0; i<b; i++) {
            ans*=a;
        }
        
        return ans;
    }
}