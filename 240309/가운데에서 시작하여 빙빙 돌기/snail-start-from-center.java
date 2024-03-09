//가운데에서 시작하는 버전으로도 풀어보면 좋을 것 같다.
//감소하는 식으로 푼다면 이전에 풀었던 문제와 다를 것이 없다.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        int row = n-1;
        int col = n-1 +1;
        //LURD
        int[] drow = new int[]{0, -1, 0, +1};
        int[] dcol = new int[]{-1, 0, +1, 0};
        int dirNum = 0;
        int count = n*n;
        for(int i=0; i<n*n; i++) {
            int nrow = row+drow[dirNum];
            int ncol = col+dcol[dirNum];
            if(isIn(nrow,ncol,n) && board[nrow][ncol]==0) {
                board[nrow][ncol] = count--;
                row = nrow;
                col = ncol;
                continue;
            } else {
                dirNum = (dirNum+1)%4;
                i--; //단 한번씩만 방향을 변경하면 되므로...
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }

    }

    static boolean isIn(int row, int col, int n) {
        if(0<=row && 0<=col && row<n && col<n) {
            return true;
        }
        return false;
    }
}