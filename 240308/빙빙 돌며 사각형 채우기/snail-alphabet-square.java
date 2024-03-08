import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //DRUL -> RDLU
        int[] drow = new int[]{0,+1,0,-1};
        int[] dcol = new int[]{+1,0,-1,0};
        int row = 0;
        int col = -1;
        int dirNum = 0;
        char[][] board = new char[n][m];
        
        char count = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                //counter 두고 무한루프되기전에 빠져나오는 방법?
                int nrow = row+drow[dirNum];
                int ncol = col+dcol[dirNum];
                if(!isIn(nrow,ncol,n,m)) {
                    dirNum = (dirNum+1)%4;
                    nrow = row+drow[dirNum];
                    ncol = col+dcol[dirNum];
                }

                if(board[nrow][ncol] != 0) {
                    dirNum = (dirNum+1)%4;
                    nrow = row+drow[dirNum];
                    ncol = col+dcol[dirNum];
                }
                
                board[nrow][ncol] = count++;
                if(count == 'Z' + 1) {
                    count = 'A';
                }
                row = nrow;
                col = ncol;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static boolean isIn(int row, int col, int n, int m) {
        if(0<=row && row<n && 0<=col && col<m) {
            return true;
        }

        return false;
    }
}