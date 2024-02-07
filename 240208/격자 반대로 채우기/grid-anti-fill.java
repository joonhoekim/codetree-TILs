import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][n];
        int count = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i%2==0) {
                    arr[n-j-1][n-i-1] = count++;
                } else {
                    arr[j][n-i-1] = count++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}