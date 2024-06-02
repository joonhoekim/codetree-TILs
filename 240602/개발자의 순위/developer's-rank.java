//문제: 2명에 대해 불변 순위를 몇개나 만들 수 있는가?
//접근: 모든 가능한 순서쌍에 대해, 모든 게임 결과를 만족시키는지 확인

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GameResult {
  List<Integer> rank = new ArrayList<Integer>();
}

public class Main {

  public static void main(String[] args) {
    //세팅 시작
    Scanner sc = new Scanner(System.in);
    int gameCount = sc.nextInt();
    int devCount = sc.nextInt();
    GameResult[] gameResults = new GameResult[gameCount];
    for (int i = 0; i < gameCount; i++) {
      gameResults[i] = new GameResult();
      for (int j = 0; j < devCount; j++) {
        gameResults[i].rank.add(sc.nextInt());
      }
    }
    //세팅 끝

    int answer = 0;
    //모든 순서쌍을 완전탐색
    //dev가 i>j 인 것임을 가정한다.
    for (int i = 1; i <= devCount; i++) {
      for (int j = 1; j <= devCount; j++) {
        if(i==j) continue;
        boolean isSatisfied = true;
        //가정이 모든 게임 결과를 만족시키는지 확인한다.
        for(GameResult gameResult : gameResults) {
          if(gameResult.rank.indexOf(i) < gameResult.rank.indexOf(j)) {
            isSatisfied = false;
            break;
          }
        }
        //만족하는 경우 정답을 추가 카운트한다.
        if(isSatisfied) {
          answer++;
        }
      }
    }

    System.out.println(answer);


  }
}