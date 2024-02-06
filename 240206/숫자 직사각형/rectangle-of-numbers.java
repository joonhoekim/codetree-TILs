import java.util.Scanner;

public class Main {

    static void set2dArrIncr(int[][] arr2d) {
        //Scanner sc = new Scanner(System.in);
        int n=arr2d.length;
        int m=arr2d[0].length;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2d[i][j]=count++;
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
        int m=sc.nextInt();
        int[][] arr2d=new int[n][m];
        set2dArrIncr(arr2d);
        print2dArr(arr2d);
        
    }
}