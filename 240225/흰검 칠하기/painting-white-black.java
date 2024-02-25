//시뮬레이션
//L 명령은 흰색, R 명령은 검은색임. 
//L두번이상 && R두번이상 칠하면 회색이 됨.
//  ㄴ 이 조건떄문에 각 타일의 정보를 정수 하나로 표현할 수 있을지 모르겠음 (흰색/검정색 구분 그리고 마지막 칠한 색을 어떻게 하지?)
//  ㄴ 그럼 클래스로 사용자 정의 데이터타입을 만들어주면 되겠는데...
//커서 사용 필요

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
            int fromIdx = -1;
            int toIdx = -1;

            if(direction=='R') { //검은색
                fromIdx = cursor;
                toIdx = cursor + distance;
                cursor = toIdx;
                for(int j=fromIdx; j<toIdx; j++) {
                    tiles[j].blackPainted++;
                    tiles[j].last = 1;
                }

            } else if(direction=='L') { //흰색
                fromIdx = cursor - distance;
                toIdx = cursor;
                cursor = fromIdx;
                for(int j=fromIdx; j<toIdx; j++) {
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
                continue;
            } else if (tiles[i].whitePainted >= 1 && tiles[i].last == 2) {
                cntWhite++;
                continue;
            } else if (tiles[i].blackPainted >=1 && tiles[i].last == 1) {
                cntBlack++;
            }
        }

        System.out.printf("%d %d %d\n",cntWhite,cntBlack,cntGray);



        
    }
}