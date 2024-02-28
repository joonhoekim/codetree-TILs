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

    XY doOffset(int offset) {
        this.x+=offset;
        this.y+=offset;
        return this;
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
            int x=sc.nextInt();
            int y=sc.nextInt();
            XY minXY=new XY(x,y);
            
            x=sc.nextInt();
            y=sc.nextInt();
            XY maxXY=new XY(x,y);

            setRect(i, minXY.doOffset(offset),maxXY.doOffset(offset));
        }

        XY max = maxXY(1);
        XY min = minXY(1);
        if(max.x == -1) {
            System.out.println(0);
            return;
        }
        int area = (max.x-min.x+1) * (max.y - min.y+1);
        System.out.print(area);
    }

    static void setRect(int value, XY minXY, XY maxXY) {
        for(int x=minXY.x; x<maxXY.x; x++) {
            for(int y=minXY.y; y<maxXY.y; y++) {
                board[x][y] = value;
            }
        }
    }

    static XY minXY(int value) {
        for(int x=0; x<boardSize; x++) {
            for(int y=0; y<boardSize; y++) {
                if(board[x][y] == value) {
                    return new XY(x,y);
                }
            }
        }
        //찾지 못한 경우
        return new XY(-1, -1);
    }

    static XY maxXY(int value) {
        for(int x=boardSize-1; x>=0; x--) {
            for(int y=boardSize-1; y>=0; y--) {
                if(board[x][y] == value) {
                    return new XY(x,y);
                }           
            }
        }
        //찾지 못한 경우
        return new XY(-1, -1);
    }
}