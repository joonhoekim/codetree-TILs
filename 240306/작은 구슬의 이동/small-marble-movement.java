import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] drow = new int[]{-1,0,1,0};
        int[] dcol = new int[]{0,-1,0,1};

        int n = sc.nextInt();
        int t = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        char dir = sc.next().charAt(0);

        int dirNum = -1;
        //이 문제가 복잡한 이유는, 열은 좌-감소, 우-증가 그대로인데
        //행만 내려오면 반대로 증가, 올라가면 반대로 감소이기 때문...
        switch(dir) {
            //L: 열만 하나 감소
            case 'L': dirNum = 1; break;
            //D: 행만 하나 감소
            case 'D': dirNum = 0; break;
            //R: 열만 하나 증가
            case 'R': dirNum = 3; break;
            //U: 행만 하나 증가
            case 'U': dirNum = 2; break;
        }

        for(int second=0; second<=t+1; second++) {
            //이동 후 값이 내부 안에 들어가 있다면 이동한다.
            int nrow = row + drow[dirNum];
            int ncol = col + dcol[dirNum];
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