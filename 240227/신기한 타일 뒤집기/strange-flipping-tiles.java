import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int boardSize = 1000*100*2+1;
        int[] arr = new int[boardSize];

        int cursor = boardSize/2;
        for(int i=0; i<n; i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            if(direction == 'R') {
                while(distance-->0) {
                    arr[cursor]=1;
                    if(distance>0) cursor--;
                }
            } else if(direction == 'L') {
                while(distance-->0) {
                    arr[cursor]=2;
                    if(distance>0) cursor++;
                }
            }
        }

        int whiteCnt=0;
        int blackCnt=0;
        for(int i=0;i<boardSize;i++) {
            if(arr[i]==1) blackCnt++;
            if(arr[i]==2) whiteCnt++;
        }

        System.out.printf("%d %d", whiteCnt, blackCnt);
    }
}