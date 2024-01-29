import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            int blankCnt;
            int starCnt;
            if(i<n) {
                blankCnt = n-i-1;
                starCnt = 2*i +1;
            } else {
                blankCnt = (i-n)+1;
                starCnt = 2*(n-(i-n)-1)-1;
            }

            for(int j=0;j<blankCnt;j++){
                System.out.print(" ");
            }
            for(int j=0;j<starCnt;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}