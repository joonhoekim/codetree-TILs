import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //엣지: 한 방향으로만 이동한 경우...

        int n = sc.nextInt();
        int boardSize = 100*10*2+2;
        //이렇게 메모리 안쓰고 풀 수도 있을까?
        //해봐야 4*2kB 정도지만...
        
        int cursor = boardSize/2;
        int[] board = new int[boardSize];
        
        for(int i=0;i<n;i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);
            int destination = -1;
            int fromIdx = -1;
            int toIdx = -1;
            
            if(direction == 'R') {
                destination = cursor + distance;
                fromIdx = cursor;
                toIdx = destination;
            }
            else if(direction == 'L') {
                destination = cursor - distance;
                fromIdx = destination;
                toIdx = cursor;
            }

            for(int j=fromIdx; j<toIdx; j++) {
                board[j]++;
            }
            
            cursor = destination;
        }

        int cnt=0;
        for(int i=0; i<boardSize; i++) {
            if(board[i] > 1) cnt++;
        }

        System.out.print(cnt);

    }
}