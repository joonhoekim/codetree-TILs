import java.util.*;
public class Main {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] dcol = new int[]{-1,0,1,0};
        int[] drow = new int[]{0,-1,0,1};

        int n = sc.nextInt();
        int t = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        char dir = sc.next().charAt(0);

        int dirNum = -1;
        switch(dir) {
            //L: 열만 하나 감소
            case 'L': dirNum = 0; break;
            case 'D': dirNum = 3; break;
            case 'R': dirNum = 2; break;
            case 'U': dirNum = 1; break;
        }

        for(int second=0; second<=t+1; second++) {
            //이동 후 값이 내부 안에 들어가 있다면 이동한다.
            int nrow = row + drow[dirNum];
            int ncol = col + dcol[dirNum];
            if(isIn(n,nrow,ncol)) {
                row = nrow;
                col = ncol;
            } else {
                dirNum = (dirNum+2)%4;
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