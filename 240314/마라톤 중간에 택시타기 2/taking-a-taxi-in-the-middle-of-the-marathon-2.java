import java.util.*;

class Coord {
    int x;
    int y;
    Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Coord[] coords = new Coord[n];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            coords[i] = new Coord(x, y);
        }

        int minDist = Integer.MAX_VALUE;

        //제외하는 걸 어케 구현할까?
         
        for(int idxExclude=1; idxExclude<n-1; idxExclude++) {
            int sumDist = 0;
            int prevIdx = 0;
            for(int i=1; i<n; i++) {
                if(i==idxExclude) {
                    continue;
                }
                sumDist += getManhattanDist(coords[prevIdx], coords[i]);
                prevIdx = i;
            }
            minDist = Math.min(minDist, sumDist);
        }

        System.out.print(minDist);

    }

    static int getManhattanDist(Coord A, Coord B) {
        return Math.abs(A.x - B.x) + Math.abs(A.y - B.y);
    }
}