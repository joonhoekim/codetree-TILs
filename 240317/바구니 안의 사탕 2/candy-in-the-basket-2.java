//단, 같은 위치에 여러 바구니가 놓여 있는 것이 가능함에 유의합니다.
// => 동일한 위치에 캔디 개수 정보가 또 들어오면 합산해야 하는가, 갱신해야 하는가? => 합산

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        final int SIZE = 100+1;
        int[] oneDimension = new int[SIZE];
        for(int i=0; i<n; i++) {
            int numberOfCandy = sc.nextInt();
            int pos = sc.nextInt();
            oneDimension[pos] += numberOfCandy;
        }
        int maxCandy = 0;
        for(int center = 0; center <= SIZE; center++) {
            int sumCandy = 0;
            for(int scan = center-k; scan <= center+k; scan++) {
                if(!isIn(scan,0,SIZE-1)) {
                    continue;
                }
                sumCandy += oneDimension[scan];
            }
            maxCandy = Math.max(maxCandy, sumCandy);
        }

        System.out.println(maxCandy);
    }

    static boolean isIn(int i, int start, int end) {
        if(start <= i && i <= end) {
            return true;
        }
        return false;
    }
}