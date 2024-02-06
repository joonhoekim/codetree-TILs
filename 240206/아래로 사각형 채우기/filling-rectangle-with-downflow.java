import java.util.Scanner;

public class Main {

    static void set2dArrIncr(int[][] arr2d) {
        int n=arr2d.length;
        int m=arr2d[0].length;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2d[i][j]=count++;
            }
        }
    }

    static void set2dArrIncrVert(int[][] arr2d) {
        int n=arr2d.length;
        int m=arr2d[0].length;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2d[j][i]=count++;
            }
        }
    }

    static void set2dArrScan(int[][] arr2d, Scanner sc) {
        int n=arr2d.length;
        int m=arr2d[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
    }

    static void print2dArr(int[][] arr2d) {
        int n=arr2d.length;
        int m=arr2d[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //int m=sc.nextInt();
        int m = n;
        int[][] arr2dA=new int[n][m];
        //int[][] arr2dB=new int[n][m];
        //int[][] arr2dAns=new int[n][m];

        set2dArrIncrVert(arr2dA);

        //set2dArrScan(arr2dB,sc);

        print2dArr(arr2dA);
        
    }
}