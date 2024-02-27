import java.util.*;

public class Main {
    static int offset = 100;
    static int offset(int n) {
        return n+offset; //to make idx, minus 1.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boardSize = 100+offset+100;
        int[][] board = new int[boardSize][boardSize];

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int x1=offset(sc.nextInt());
            int y1=offset(sc.nextInt());
            int x2=offset(sc.nextInt());
            int y2=offset(sc.nextInt());
            
            for(int row=x1; row<x2; row++) {
                for(int col=y1; col<y2; col++){
                    board[row][col]++;
                }
            }
        }

        int area=0;
        for(int row=0; row<boardSize; row++) {
            for(int col=0; col<boardSize; col++){
                if(board[row][col]!=0) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}