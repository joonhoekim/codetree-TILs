import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n=sc.nextInt();
        for (int i=2; i<=n; i++) {
            boolean isPrime = true;
            for( int j=2; j<i; j++) {
                if(i%j==0) isPrime = false;
                break;
            }
            if(isPrime) {
                sb.append(i+" ");
            }
        }
        System.out.print(sb);
        

    }
}