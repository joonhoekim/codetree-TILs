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
                for(int j=cursor; j<cursor+distance; j++) {
                    arr[j]=1; //1=검은색
                }
                cursor = cursor+distance-1;
            } else if(direction == 'L') {
                for(int j=cursor; j>cursor-distance; j--) {
                    arr[j]=2; //2=흰색
                }
                cursor = cursor-distance+1;
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