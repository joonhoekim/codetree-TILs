import java.util.Scanner;

class Rect {
    int x1;
    int y1;
    int x2;
    int y2;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int offset = 1000;
        int boardSize = 1000+offset+1;
        int[][] board = new int[boardSize][boardSize];

        Rect[] rects = new Rect[2];


        for(int i=0; i<2; i++) {
            rects[i] = new Rect();
            rects[i].x1 = sc.nextInt() + offset;
            rects[i].y1 = sc.nextInt() + offset;
            rects[i].x2 = sc.nextInt() + offset;
            rects[i].y2 = sc.nextInt() + offset;
        }

        
        for(int x=rects[0].x1; x<rects[0].x2; x++) 
            for(int y=rects[0].y1;y<rects[0].y2; y++)
                board[x][y] = 1;
        
        for(int x=rects[1].x1; x<rects[1].x2; x++) 
            for(int y=rects[1].y1;y<rects[1].y2; y++)
                board[x][y] = -1;

        int minX = 2001;
        int minY = 2001;
        int maxX = 0;
        int maxY = 0;

        for(int x=0; x<boardSize; x++) 
            for(int y=0; y<boardSize; y++)
                if(board[x][y]==1) {
                    minX = Math.min(minX,x);
                    minY = Math.min(minY,y);
                    maxX = Math.max(maxX,x);
                    maxY = Math.max(maxY,y);
                }

        // System.out.printf("%d %d %d %d\n",minX, minY, maxX, maxY);

        System.out.println(
            (maxX - minX + 1) * (maxY - minY + 1)
        );
        
    }
}