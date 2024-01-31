import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int count=0;
        for(int i=a; i<=b; i++){
            int sumOfDevider = 0;
            for( int j=1; j<i; j++) {
                if (i%j==0) {
                    sumOfDevider+=j;
                }
            }
            if(sumOfDevider==i) {
                count++;
            }
        }
        System.out.print(count);
    }
}