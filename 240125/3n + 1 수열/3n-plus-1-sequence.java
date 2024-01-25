import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();

        for (;;) {
            if(n<=1) {
                System.out.print(count);
                break;
            }

            if(n%2==0){
                n=n/2;
            } else {
                n=n*3+1;
            }
            count++;
        }
    }
}