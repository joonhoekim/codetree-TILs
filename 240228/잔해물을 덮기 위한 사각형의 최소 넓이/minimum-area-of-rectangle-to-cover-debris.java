//분류: 시뮬레이션 - 2차원
//잔해물을 덮기 위한  `사각형`의 최소 넓이

import java.util.*;

class XY {
    int x;
    int y;

    XY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static final int offset=1000;
    static final int boardSize = 1000+offset+1;
    static int[][] board  = new int[boardSize][boardSize];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 2;

        for(int i=1; i<=n; i++) {
            //int value = 1;
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();

            //addRect(...)
            setRect(i, x1, y1, x2, y2);
            //value 1 이면 남는 것
        }

        XY minXY = getMinXY(1);
        XY maxXY = getMaxXY(1);

        int area = (maxXY.x-minXY.x+1) * (maxXY.y-minXY.y+1);
        System.out.print(area);

    }

    static XY getMinXY(int value){
        for(int x=0; x<boardSize; x++) {
            for(int y=0; y<boardSize; y++) {
                if(board[x][y]==value) {
                    return new XY(x,y);
                }
            }
        }
        return new XY(-1,-1);
    }

    static XY getMaxXY(int value){
        for(int x=boardSize-1; x>=0; x--) {
            for(int y=boardSize-1; y>=0; y--) {
                if(board[x][y]==value) {
                    return new XY(x,y);
                }
            }
        }
        return new XY(-1,-1);
    }

    static int countValue(int value) {
        //엣지: int 오버플로 없음(10^6 < 10^9)
        int cnt=0;
        for(int x=0; x<boardSize; x++) {
            for(int y=0; y<boardSize; y++) {
                if(board[x][y]==value) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


    static int countNonzero() {
        //엣지: int 오버플로 없음(10^6 < 10^9)
        int cnt=0;
        for(int x=0; x<boardSize; x++) {
            for(int y=0; y<boardSize; y++) {
                if(board[x][y]!=0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static void setRect(int value, int x1, int y1, int x2, int y2) {
        for(int x=x1+offset; x<x2+offset; x++) {
            for(int y=y1+offset; y<y2+offset; y++) {
                board[x][y]=value;
            }
        }
    }
}