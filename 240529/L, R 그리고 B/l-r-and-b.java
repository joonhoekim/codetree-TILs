// 최단 경로 구하기

// 직선으로 이어지는 경우를 제외하면, 최단경로 길이에 R이 영햐을 미치지 않는다.
// 이 점을 활용하면 실제로 도달하는 것을 시뮬레이션하지 않아도 될 것이다.

import java.util.Scanner;

class RC {
    int row;
    int col;

    RC(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boardWidth = 10;
        int boardHeight = 10;
        char[][] board = new char[boardHeight][boardWidth];

        RC l = null;
        RC r = null;
        RC b = null;


        for (int row = 0; row < boardHeight; row++) {
            board[row] = sc.nextLine().toCharArray();

            for (int col = 0; col < boardWidth; col++) {
                if (board[row][col] == 'L') {
                    l = new RC(row, col);
                } else if (board[row][col] == 'R') {
                    r = new RC(row, col);
                } else if (board[row][col] == 'B') {
                    b = new RC(row, col);
                }
            }
        }

        if (isStraight(l, b)) { // && 문법에 따라 isStraight를 먼저 검사한다!
            if ( isBlocked(l, r, b)) {
                System.out.println(getMinDiagonalDist(l, b) + 2);
            } else {
                System.out.println(getMinDiagonalDist(l, b));
            }
        } else {
            System.out.println(getMinDiagonalDist(l, b));
        }


    }


    private static boolean isBlocked(RC l, RC r, RC b) {
        if (l.row == b.row && b.row == r.col) {
          int min = Math.min(l.col, b.col);
          int max = Math.max(l.col, b.col);
          if(min < r.col && r.col < max) {
              return true;
          }
        }

        else if (l.col == b.col && b.col == r.col) {
            int min = Math.min(l.row, b.row);
            int max = Math.max(l.row, b.row);
            if(min < r.row && r.row < max) {
                return true;
            }
        }

        return false;

    }

    private static int getMinDiagonalDist(RC l, RC b) {
        int distHeight = Math.abs(l.row - b.row);
        int distWidth = Math.abs(l.col - b.col);
        return distHeight + distWidth - 1;
    }


    private static boolean isStraight(RC l, RC b) {
        return l.row == b.row || l.col == b.col;
    }
}