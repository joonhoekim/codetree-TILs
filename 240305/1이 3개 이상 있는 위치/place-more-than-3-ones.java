import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //[인접한 칸에 숫자 1이 적혀 있는 칸의 수가 3개 이상인 칸]의 수를 세기
        //단 대각선은 인접하다고 보지 않음. 상하좌우만 세기. 그래서 dx dy 4개 케이스만 보면 됨.
        int count = 0;
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};
        for(int i=0;i<n;i++) {
            for(int j=0; j<n; j++) {
                int countOne = 0;
                for(int dirNum=0;dirNum<4;dirNum++) {
                //상하좌우 행에 대해서 검사하기
                    if(isIn(i+dx[dirNum], j+dy[dirNum]) && 
                    matrix[i+dx[dirNum]][j+dy[dirNum]]==1) { //왼쪽부터 검사하므로... no exception
                        countOne++;
                    }
                }
                if(countOne>=3) {
                    count++;
                }
            }           
        }

        System.out.print(count);

    }

    static boolean isIn(int row, int col) {
        if(0<=row && row<n && 0<=col && col<n) {
            return true;
        }
        return false;
    }
}