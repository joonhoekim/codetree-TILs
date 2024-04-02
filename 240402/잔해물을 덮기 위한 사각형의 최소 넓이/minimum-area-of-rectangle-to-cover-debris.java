import java.sql.SQLOutput;
import java.util.Scanner;

class Rect {

  int x1;
  int x2;
  int y1;
  int y2;
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rect[] rects = new Rect[2];
    for (int i = 0; i < 2; i++) {
      rects[i] = new Rect();
    }

    int offset = 1000;
    int boardSize = offset + 1000 + 1;
    int[][] board = new int[boardSize][boardSize];

    for (int i = 0; i < 2; i++) {
      rects[i].x1 = sc.nextInt() + offset;
      rects[i].y1 = sc.nextInt() + offset;
      rects[i].x2 = sc.nextInt() + offset;
      rects[i].y2 = sc.nextInt() + offset;
    }

    //첫번쨰 사각형을 1로 표현하기
    for (int x = rects[0].x1; x < rects[0].x2; x++) {
      for (int y = rects[0].y1; y < rects[0].y2; y++) {
        //칠해진 보드 좌표는 보드 격자의 왼쪽 아래 좌표를 의미한다.
        board[x][y] = 1;
      }
    }

    //두번째 사각형을 -1로 표현하기
    for (int x = rects[1].x1; x < rects[1].x2; x++) {
      for (int y = rects[1].y1; y < rects[1].y2; y++) {
        //칠해진 보드 좌표는 보드 격자의 왼쪽 아래 좌표를 의미한다.
        board[x][y] = -1;
      }
    }

    //최대 좌표와 최소 좌표 구하기
    int count = 0;
    int minX = 2000;
    int maxX = 0;
    int minY = 2000;
    int maxY = 0;
    for (int x = 0; x < boardSize; x++) {
      for (int y = 0; y < boardSize; y++) {
        if (board[x][y] == 1) {
          count++;
          minX = Math.min(minX, x);
          maxX = Math.max(maxX, x);
          minY = Math.min(minY, y);
          maxY = Math.max(maxY, y);
        }
      }

    }

    int ans = 0;
    //남은 잔해가 없다면 다 덮인 것이므로 0이다.
    if (count == 0) {
      ans = 0;
    }
    //만약 1개만 나왔다면 넓이가 1이다.
    else if (count == 1) {
      ans = 1;
    }
    //여러개 나왔다면, 최소/최대값 이용해서 답을 구한다.
    else {
      ans = (maxX - minX+1) * (maxY - minY+1);
    }

    System.out.println(ans);


  }

}