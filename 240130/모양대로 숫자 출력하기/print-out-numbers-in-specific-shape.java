import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int bCount;
        int nCount;
        for(int i=1; i<=n;i++){

            bCount=i-1;
            nCount=n-i+1;

            for(int j=1; j<=bCount; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nCount; j++){
                System.out.printf("%d ", nCount-j+1);
            }
            System.out.print("\n");
        }
    }
}