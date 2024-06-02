//문제
//1차원 직선 위 N개의 선분 정보를 줄 것임
//임의의 3개를 제거하여, 모두 겹치지 않는 상황을 만들고자 함.
//그 경우를 만족시키는, 제거할 선분 3개를 선택하는 경우의 수는?
//조건1: 경계에서 닿는 경우도 '겹친다'고 판단함.

//접근
//선분 3개를 선택하는 경우를 완전탐색하여
//모두 겹치지 않는 경우를 정답에 포함시킨다.

import java.util.Scanner;

class Line {

  int startX;
  int endX;

  Line(int startX, int endX) {
    this.startX = startX;
    this.endX = endX;
  }
}

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int lineCount = sc.nextInt();
    Line[] lines = new Line[lineCount];
    for (int i = 0; i < lineCount; i++) {
      lines[i] = new Line(sc.nextInt(), sc.nextInt());
    }

    int answer = 0;

    //제거할 3가지를 선택하자.
    for (int i = 0; i < lines.length - 2; i++) {
      for (int j = i + 1; j < lines.length - 1; j++) {
        for (int k = j + 1; k < lines.length; k++) {
          //그 3가지 제거한 경우 중복이 없는지 확인하자.
          int[] excludedIdx = new int[]{i, j, k};
          if (checkUnoverwrappedWithExclusion(lines, excludedIdx)) {
            answer++;
          }

        }
      }
    }

    System.out.println(answer);
  }

  private static boolean checkUnoverwrappedWithExclusion(Line[] lines, int[] excludedIdx) {

    //선분 둘을 짝지어 Overwrap 여부를 확인한다.
    for (int line1Idx = 0; line1Idx < lines.length; line1Idx++) {
      loop:
      for (int line2Idx = 0; line2Idx < lines.length; line2Idx++) {
        if(line1Idx==line2Idx) continue;

        //excluded lineIdx은 제외한다.
        for (int i = 0; i < excludedIdx.length; i++) {
          if (line1Idx == excludedIdx[i] || line2Idx == excludedIdx[i]) {
            continue loop;
          }
        }

        boolean seperated =
            (lines[line1Idx].endX < lines[line2Idx].startX) || (lines[line1Idx].startX > lines[line2Idx].endX);

        if (!seperated) {
          return false;
        }


      }
    }
    return true;

  }
}