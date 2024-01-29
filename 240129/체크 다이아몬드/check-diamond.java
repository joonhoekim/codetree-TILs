import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int bCount=n-i;
            int sCount=i;

            for(int j=1; j<=bCount; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=sCount; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i=1; i<=n-1; i++){
            int bCount=i;
            int sCount=n-i;
            for(int j=1; j<=bCount; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=sCount; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}