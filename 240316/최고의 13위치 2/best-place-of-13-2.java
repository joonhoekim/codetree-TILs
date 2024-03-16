import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] board = new int[n][n];
    int scanSize = n-2;

    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    int maxSum=0;
    for(int i=0; i<n; i++) {
      for(int j=0; j<scanSize; j++) {
        if(isOutOfBound(i,j+2,n,n)) {
          continue;
        }
        int sum = board[i][j] + board[i][j+1] + board[i][j+2];
        for(int k=i; k<n; k++) {
          for(int l=j; l<scanSize; l++) {
            //겹치면 안됨
            if(k==i) {
              if(l==j || l==j+1 || l==j+2) {
                continue;
              }
            }

            if(isOutOfBound(k,l+2,n,n)) {
              continue;
            }
            sum = sum + board[k][l] + board[k][l+1] + board[k][l+2];
            maxSum = Math.max(maxSum, sum);
            sum = board[i][j] + board[i][j+1] + board[i][j+2];
          }
        }

      }
    }
    System.out.print(maxSum);
  }

  static boolean isOutOfBound(int r, int c, int rCount, int cCount) {
    if(0<=r && 0<=c && r<rCount && c<cCount) {
      return false;
    }

    return true;
  }
}