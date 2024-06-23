import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] board = new int[3][3];
    for(int i=0; i<3; i++) {
      char[] input = sc.nextLine().toCharArray();
      for(int j=0; j<3; j++) {
        board[i][j] = input[j] - '0';
      }
    }

    // 승리 결정은 가로 3개, 세로 3개, 대각선 2개가 전부이다.
    // 해당 경로에 숫자 개수가 정확히 2개이면 하면, '이기는 조합'에 추가하자.
    // 만약 숫자 개수가 1개이면 '개인으로 이기는 상황' 이므로 문제 조건에 부합하지 않는다.
    Set<Set<Integer>> winningSet = new HashSet<>();
    for(int row=0; row<3; row++) {
      Set<Integer> elements = new HashSet<>();
      elements.add(board[row][0]);
      elements.add(board[row][1]);
      elements.add(board[row][2]);
      if(elements.size() == 2) {
        winningSet.add(elements);
      }
    }


    for(int col=0; col<3; col++) {
      Set<Integer> elements = new HashSet<>();
      elements.add(board[0][col]);
      elements.add(board[1][col]);
      elements.add(board[2][col]);
      if(elements.size() == 2) {
        winningSet.add(elements);
      }
    }

    {
      Set<Integer> elements = new HashSet<>();
      elements.add(board[0][0]);
      elements.add(board[1][1]);
      elements.add(board[2][2]);
      if(elements.size() == 2) {
        winningSet.add(elements);
      }
    }

    {
      Set<Integer> elements = new HashSet<>();
      elements.add(board[0][2]);
      elements.add(board[1][1]);
      elements.add(board[2][0]);
      if(elements.size() == 2) {
        winningSet.add(elements);
      }
    }

    System.out.println(winningSet.size());

  }
}