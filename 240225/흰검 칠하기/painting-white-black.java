//칠하고 나서 커서의 위치를 생각하는 게 이 문제를 어렵게 만드는 부분이다...

import java.util.*;

class Tile {
  int blackPainted;
  int whitePainted;
  int last; //1=black; 2=white;
}

public class Main {
  static final int tileSize = 1000*100*2+1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Tile[] tiles = new Tile[tileSize];
    for(int i=0;i<tileSize;i++) {
      tiles[i] = new Tile();
    }
    int cursor = tileSize/2;
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
      int distance = sc.nextInt();
      int direction = sc.next().charAt(0);
      int fromIdx;
      int toIdx;

      if(direction=='R') { //검은색
        fromIdx = cursor;
        toIdx = cursor + distance -1;
        cursor = toIdx;
        for(int j=fromIdx; j<=toIdx; j++) {
          tiles[j].blackPainted++;
          tiles[j].last = 1;
        }
      } else if(direction=='L') { //흰색
        fromIdx = cursor - distance + 1;
        toIdx = cursor;
        cursor = fromIdx;
        for(int j=fromIdx; j<=toIdx; j++) {
          tiles[j].whitePainted++;
          tiles[j].last = 2;
        }
      }
    }

    int cntWhite=0;
    int cntBlack=0;
    int cntGray=0;
    for(int i=0;i<tileSize;i++) {
      if(tiles[i].whitePainted>=2 && tiles[i].blackPainted>=2) {
        cntGray++;
      } else if (tiles[i].whitePainted >= 1 && tiles[i].last == 2) {
        cntWhite++;
      } else if (tiles[i].blackPainted >= 1 && tiles[i].last == 1) {
        cntBlack++;
      }
    }

    //System.out.println("W B G");
    System.out.printf("%d %d %d\n",cntWhite,cntBlack,cntGray);

  }
}