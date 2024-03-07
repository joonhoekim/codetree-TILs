import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int dRow[]=new int[]{0,+1,0,-1};
    static int dCol[]=new int[]{-1,0,1,0};
    //LDRU
    static int[][] board = new int[n][n];
    
    public static void main(String[] args) {

        for(int i=0; i<m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;

            //칠한 직후에 편안한 상태를 알아내기 (근데 순서에 따른 결과 차이는 없음..)
            //칠하기
            board[row][col] = 1;
            //확인하기
            if(isConvenient(row, col)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }


        
    }
    static int rotate90CounterClockwise(int dirNum) {
        return (dirNum+1)%4;
    }

    static boolean isConvenient(int row, int col) {
        int count=0;
        int dirNum=0;
        for(int i=0; i<4; i++) {
            dirNum = rotate90CounterClockwise(dirNum);
            int nRow = row+dRow[dirNum];
            int nCol = col+dCol[dirNum];
            if(isIn(nRow,nCol) && board[nRow][nCol]!=0) {
                count++;
            }
        }

        if(count == 3) {
            return true;
        }
        return false;
    }

    static boolean isIn(int row, int col) {
        if(0<=row && row<n && 0<=col && col < n) {
            return true;
        }
        return false;
    }
}