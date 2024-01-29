import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;

        for(int i=1; i<=n; i++) {
            if(i%2==1) {
                //홀수행
                count = n-(i/2);
                for(int j=0; j<count; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            } else {
                //짝수행
                count = i/2;
                for(int j=0; j<count; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }

        for(int i=n; i>=1; i--) {
            if(i%2==1) {
                //홀수행
                count = n-(i/2);
                for(int j=0; j<count; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            } else {
                //짝수행
                count = i/2;
                for(int j=0; j<count; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }

       
        
    }
}