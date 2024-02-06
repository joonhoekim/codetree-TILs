import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 4;
        int[][] arr2d = new int[n][m];

        for(int i = 0; i<n; i++) {
            int sum=0;
            for(int j=0; j<m; j++) {
                arr2d[i][j] = sc.nextInt();
                sum+=arr2d[i][j];
            }   
            System.out.println(sum);
        }

    }
}