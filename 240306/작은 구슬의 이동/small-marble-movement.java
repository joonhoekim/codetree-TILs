import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};

        int n = sc.nextInt();
        int t = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        char dir = sc.next().charAt(0);

        int dirNum = -1;
        switch(dir) {
            case 'L': dirNum = 1; break;
            case 'D': dirNum = 2; break;
            case 'R': dirNum = 3; break;
            case 'U': dirNum = 0; break;
        }

        for(int i = 0; i<=t+1; i++) {
            //이동 후 값이 내부 안에 들어가 있다면 이동한다.
            int nrow = row + dx[dirNum];
            int ncol = col + dy[dirNum];
            if(isIn(n,nrow,ncol)) {
                row = nrow;
                col = ncol;
            } else {
                dirNum = (dirNum + 2) % 4;
            }
        }
        System.out.print(row+" "+col);
        
    }

    static boolean isIn(int n, int row, int col) {
        if(0<=row && row<n && 0<= col && col < n) {
            return true;
        }
        return false;
    }
}