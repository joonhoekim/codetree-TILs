import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100;
        int boardSize = 100+offset+1;
        int[][] board = new int[boardSize][boardSize];

        for(int i=1; i<=n; i++) {
            int x1 = sc.nextInt()+offset;
            int y1 = sc.nextInt()+offset;
            int x2 = sc.nextInt()+offset;
            int y2 = sc.nextInt()+offset;

            for(int x=x1; x<x2; x++) {
                for(int y=y1; y<y2; y++) {
                    if(i%2==0) { //짝수번째 = 파란색
                        board[x][y]=+1;
                    } else {
                        board[x][y]=-1;
                    }
                }
            }
        }

        int count = 0;
        for(int x=0; x<boardSize; x++) {
            for(int y=0; y<boardSize; y++) {
                if(board[x][y] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count); 
    }
}