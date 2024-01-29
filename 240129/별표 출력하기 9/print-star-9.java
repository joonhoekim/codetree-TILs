import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            int blankCnt=2*(n-1)-2*i;
            int starCnt=2*(i+1)-1;

            for(int j=0; j<blankCnt; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<starCnt; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }

    }
}