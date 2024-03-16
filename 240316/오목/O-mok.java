import java.util.Scanner;

public class Main {

  static int boardsize = 19;

  public static void main(String[] args) throws Exception{
    //처음 풀 때는 가로, 세로, / , \ 각각을 구했는데
    //풀고 해답을 보니까 dxdy로 푸는 방법이 있어서 그것도 구현해 보기
    //각 방법의 장단점?

    Scanner sc = new Scanner(System.in);

    //기본 세팅 (변수설정 및 입력처리)

    int[][] board = new int[boardsize][boardsize];

    for(int i=0; i<boardsize; i++) {
      for(int j=0; j<boardsize; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    //dxdy 준비 (왼쪽부터 반시계로 돌기)
    int[] drow = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
    int[] dcol = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
    int dirNum=0;

    //보드의 모든 지점에 대해 모든 방향에 우승조건이 만족되는지 검출
    // - 보드를 나가는지를 검사할 수 있어야 함
    // - i, j 는 우승 지점의 가운데로 가정함
    int winner = 0; //승부 미정 = 0
    final int WIN_CONDITION = 5;

    for(int i=0; i<boardsize; i++) {//검사지점 (행)
      for(int j=0; j<boardsize; j++) {//검사지점 (열)

        if(board[i][j]==0) { //가운데가 빈 경우는 바로 넘김
          continue;
        }

        //우승여부 확인
        for(int k=0; k<drow.length; k++) { //확인할 방향 설정 (0~7)
          dirNum = k;
          int count = 0; //방향 설정시마다 카운트 변경
          for(int streak=-2; streak<=2; streak++) { //-2~+2까지 검사
            int nrow = i + streak * drow[dirNum];
            int ncol = j + streak * dcol[dirNum];

            //그냥 넘기는 경우 : 보드밖, 빈칸, 이전과 다른 색
            if(!isRange(nrow, ncol)) { // 보드 밖으로 나가는 예외를 가장 먼저 처리
              break;
            } else if(board[nrow][ncol] == 0) { // 빈 칸이 있는 경우를 처리
              break;
            } else if(board[nrow][ncol] != board[i][j]) { //시작점과 다른 돌이 있는 경우
              break;
            }

            count++;
          }
          //5번 카운트 완료되면 이긴 돌과 중심점 출력하고 반환을 통해 메서드 종료
          if(count==5) {
            winner = board[i][j];
            System.out.println(winner);
            System.out.printf("%d %d", i+1, j+1);
            return;
          }
        }
      }
    }

    //우승자 없는 경우 0 출력
    System.out.print(winner);

  }

  //보드 나갔는지 검사하기
  static boolean isRange(int row, int col) {
    if(0<=row && 0<= col && row<boardsize && col<boardsize) {
      return true;
    }
    return false;
  }
}