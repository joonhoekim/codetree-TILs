import java.util.Scanner;

public class Main {

    static void set2dArr(int[][] arr2d, int n, int m) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        
        int n=4;
        int m=4;
        int[][] arr2d=new int[n][m];
        set2dArr(arr2d,n,m);

        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>=j) {
                    sum+=arr2d[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}