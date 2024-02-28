//분류: 시뮬레이션 - 2차원
import java.util.*;

public class Main {
    static final int offset=100;

    static final int boardSize = 100+offset+1;
    static int[][] board = new int[boardSize][boardSize];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int value = 1;
            // int x1=sc.nextInt();
            // int y1=sc.nextInt();
            // int x2=sc.nextInt();
            // int y2=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=x1+8;
            int y2=y1+8;
            //addRect(...)
            setRect(value, x1, y1, x2, y2);
        }   
        System.out.println(countNonzero());
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