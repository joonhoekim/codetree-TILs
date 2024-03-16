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
        for(int k=i; k<n; k++) {
          for(int l=j; l<scanSize; l++) {
            //겹치면 안됨
            if(k==i && Math.abs(j-l)<=2) {
              continue;
            }
            int sum1 = board[i][j] + board[i][j+1] + board[i][j+2];
            int sum2 = board[k][l] + board[k][l+1] + board[k][l+2];
            maxSum = Math.max(maxSum, sum1+sum2);
          }
        }

      }
    }
    System.out.print(maxSum);
  }
}