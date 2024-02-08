import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //격자크기
        int m = sc.nextInt(); //동전개수
        //int count = 1;

        int[][] brd = new int[n][n];
        
        for(int i=0; i<m; i++){
            int rowIdx = sc.nextInt() - 1 ;
            int colIdx = sc.nextInt() - 1 ;

            brd[rowIdx][colIdx]=(rowIdx+1) * (colIdx+1);
        }

        for(int rowIdx = 0; rowIdx<n; rowIdx++){
            for(int colIdx = 0; colIdx<n; colIdx++) {
                System.out.print(brd[rowIdx][colIdx]+" ");
            }
            System.out.println("");
        }
    }
}