import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        int count=0;
        //arr[i][j]

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i%2==0){
                    arr[j][i]=count++;
                }else {
                    arr[n-j-1][i]=count++;
                }
                
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}