import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static char[][] mirrorBoard = new char[n][n];

    //D,L,U,R
    static int[] dRow = new int[]{+1,0,-1,0};
    static int[] dCol = new int[]{0,-1,0,+1};
    
    static void setBoard() {
        for(int i=0; i<n; i++) {
            String input = sc.next();
            for(int j=0; j<n; j++) {
                mirrorBoard[i][j] = input.charAt(j);
            }
        }
    }

    static boolean isRange(int row, int col) {
        if(0<=row && row<n && 0<=col && col<n) {
            return true;
        }
        return false;
    }

    //DLUR 0123
    static int mirror(char currentMirror, int dirNum) {
        if(currentMirror == '/') {
            if(dirNum == 0) {
                return 1;
            } else if (dirNum == 1) {
                return 0;
            } else if (dirNum == 2) {
                return 3;
            } else if (dirNum == 3) {
                return 2;
            }
        } else if (currentMirror == '\\') {
            if(dirNum == 0) {
                return 3;
            } else if (dirNum == 3) {
                return 0;
            } else if (dirNum == 1) {
                return 2;
            } else if (dirNum == 2) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        setBoard();
        int k = sc.nextInt()-1; //계산 편하게 1 빼서 받음

        int row = -1;
        int col = -1;
        if(k/n==0) {
            row = 0;
            col = k;
        } else if (k/n==1) {
            row = k%n;
            col = n-1;
        } else if (k/n==2) {
            row = n-1;
            col = n-k-1;
        } else if (k/n==3) {
            row = n-k-1;
            col = 0;
        }
        
        int dirNum = k/n; //간단하다!
        char pastMirror = mirrorBoard[row][col];

        int count = 0;
        while(true) {
            count++;
            dirNum = mirror(pastMirror, dirNum);
            int nRow = row+dRow[dirNum];
            int nCol = col+dCol[dirNum];
            if(isRange(nRow,nCol)) {
                row = nRow;
                col = nCol;
                continue;
            } else {
                System.out.print(count);
                return;
            }
        }         
    }
}