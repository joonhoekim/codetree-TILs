import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int boardsize = 19;
    int[][] board = new int[boardsize][boardsize];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    int winStreak = 5;
    for (int row = 0; row < board.length - winStreak; row++) {
      for (int col = 0; col < board[0].length; col++) {
        //세로줄 달성 확인하기

        int winner = -1; //-1: 누군가가 우승함, 0: Nobody win, 1:흑 우승, 2:백 우승
        int start = board[row][col];
        for (int scan = row; scan < row + winStreak; scan++) {
          if (board[scan][col] == 0 || board[scan][col] != start) {
            winner = 0;
            break;
          }
        }
        if (winner == -1) {
          winner = start;
          System.out.println(winner);
          System.out.printf("%d %d", row + 3, col + 1);
          return;
        }
      }
    }

    //가로줄 달성 확인하기
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length - winStreak; col++) {

        int winner = -1; //-1: 누군가가 우승함, 0: Nobody win, 1:흑 우승, 2:백 우승
        int start = board[row][col];
        for (int scan = col; scan < col + winStreak; scan++) {
          if (board[row][scan] == 0 || board[row][scan] != start) {
            winner = 0;
            break;
          }
        }
        if (winner == -1) {
          winner = start;
          System.out.println(winner);
          System.out.printf("%d %d", row + 1, col + 3);

          return;
        }
      }
    }

    //대각선 달성 확인하기 \
    for (int row = 0; row < board.length - winStreak; row++) {
      for (int col = 0; col < board[0].length - winStreak; col++) {

        int winner = -1; //-1: 누군가가 우승함, 0: Nobody win, 1:흑 우승, 2:백 우승
        int start = board[row][col];
        for (int i = 0; i < winStreak; i++) {
          if (board[row + i][col + i] == 0 || board[row + i][col + i] != start) {
            winner = 0;
            break;
          }
        }
        if (winner == -1) {
          winner = start;
          System.out.println(winner);
          System.out.printf("%d %d", row + 3, col + 3);
          return;
        }
      }
    }

    //대각선 달성 확인하기 /
    //이 케이스는 반복문의 시작점이 스타트포인트가 아님!!!!
    for (int row = 0; row < board.length - winStreak; row++) {
      for (int col = 0; col < board[0].length - winStreak; col++) {
        int winner = -1; //-1: 누군가가 우승함, 0: Nobody win, 1:흑 우승, 2:백 우승
        int start = board[row + winStreak - 1][col];
        for (int i = 0; i < winStreak; i++) {
          int tested = board[row + winStreak - i - 1][col + i];
          if (tested == 0
              || tested != start) {
            winner = 0;
            break;
          }
        }
        if (winner == -1) {
          winner = start;
          System.out.println(winner);
          System.out.printf("%d %d", row + 3, col + 3);
          return;
        }
      }
    }

    System.out.print(0);
  }
}