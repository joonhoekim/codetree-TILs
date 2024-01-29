import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<2*n-1; i++){
            if (i>=n) {
                cnt--;
            } else {
                cnt++;
            }
            for(int j=0; j<cnt; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

//case1
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }
        // for (int i=0; i<n; i++){
        //     for(int j=n; j>i+1; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");