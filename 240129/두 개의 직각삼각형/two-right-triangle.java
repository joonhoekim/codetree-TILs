import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCnt;
        int blankCnt;
        for(int i=0; i<n; i++) {
            starCnt = n-i; //3 2 1
            blankCnt = i; //0 1 2

            for(int j=0;j<starCnt;j++) {
                System.out.print("*");
            }
            for(int j=0;j<blankCnt;j++){
                System.out.print("  "); //double blank
            }
            for(int j=0;j<starCnt;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}