import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int row = 0;
    int col = -1;
    int count = 1;
    int[][] board = new int[n][m];

    //L U R D
    int[] dRow = new int[]{0, -1, 0, +1};
    int[] dCol = new int[]{-1, 0, 1, 0};

    int dirNum = 2;
    int nRow = 0;
    int nCol = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        //if(다음이 범위 안 AND 다음이 0(처음 만나는 위치)) 숫자기록
        //else(하나라도 아니라면) 시계방향으로 90도 회전 하고 숫자기록

        nRow = row + dRow[dirNum];
        nCol = col + dCol[dirNum];
        if (!isIn(nRow, nCol, n, m)) {
          dirNum = clockwise90Rotate(dirNum);
          nRow = row + dRow[dirNum];
          nCol = col + dCol[dirNum];
        }
        if (board[nRow][nCol] != 0) {
          dirNum = clockwise90Rotate(dirNum);
          nRow = row + dRow[dirNum];
          nCol = col + dCol[dirNum];
        }
        board[nRow][nCol] = count++;
        row = nRow;
        col = nCol;
      }
    }

    print2dArr(board);
  }

  static boolean isIn(int row, int col, int n, int m) {
    if (0 <= row && row < n && 0 <= col && col < m) {
      return true;
    }
    return false;
  }

  static int clockwise90Rotate(int dirNum) {
    return (dirNum + 1) % 4;
  }

  static void print2dArr(int[][] arr2D) {
    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[0].length; j++) {
        System.out.print(arr2D[i][j] + " ");
      }
      System.out.println("");
    }
  }
}