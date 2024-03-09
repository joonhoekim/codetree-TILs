import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String command = sc.next();

        int[][] board = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        //LDRU
        int[] drow = new int[]{0, +1, 0, -1};
        int[] dcol = new int[]{-1, 0, +1, 0};
        
        int dirNum = 3;
        int row = n/2;
        int col = n/2;
        int sum = board[row][col];
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'L') {
                dirNum = turnLeft(dirNum);
            } else if(command.charAt(i) == 'R') {
                dirNum = turnRight(dirNum);
            } else if(command.charAt(i) == 'F') {
                int nrow = row+drow[dirNum];
                int ncol = col+dcol[dirNum];
                if(isIn(nrow,ncol,n)) {
                    row = nrow;
                    col = ncol;
                    sum+=board[row][col];
                }
            }
        }

        System.out.print(sum);
    }

    static int turnLeft(int dirNum) {
        return (dirNum+1)%4;
    }

    static int turnRight(int dirNum) {
        return (dirNum-1 +4)%4;
    }

    static boolean isIn(int row, int col, int n) {
        if(0<=row && 0<= col && row<n && col<n) {
            return true;
        }
        return false;
    }
}