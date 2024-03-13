import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        char[][] board = new char[rowSize][colSize];
        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<colSize; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        char start = board[0][0];
        char end = board[rowSize-1][colSize-1];

        //시작, 끝이 같은 색이면 룰 따라 도착 불가함
        if(start == end) {
            System.out.print(0);
            return;
        }

        int count = 0;
        for(int i=1; i<rowSize-2; i++) {
            for(int j=1; j<colSize-2; j++) {

                for(int k=i+1; k<rowSize-1; k++) {
                    for (int l=j+1; l<colSize-1; l++) {

                        if(board[i][j] != start && board[k][j] == start) {
                            count++;
                        } 
                    }
                }

                
            }
        }

        System.out.print(count);
    }
}