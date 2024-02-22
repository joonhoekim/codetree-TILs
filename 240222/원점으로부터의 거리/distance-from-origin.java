import java.util.*;
import java.io.*;

class Coord implements Comparator<Coord> {
    int x;
    int y;
    int idx;

    Coord(int x, int y, int idx) {
        this.x=x;
        this.y=y;
        this.idx = idx;
    }

    public void print() {
        System.out.println(idx);
    }

    @Override
    public int compare(Coord a, Coord b) {
        return ((Math.abs(a.x)+ Math.abs(a.y)) - (Math.abs(b.x)+Math.abs(b.y)));
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Coord[] coords = new Coord[n];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coords[i] = new Coord(x,y,i+1);
        }

        Arrays.sort(coords, (a,b) -> {
            return ((Math.abs(a.x)+ Math.abs(a.y)) - (Math.abs(b.x)+Math.abs(b.y)));
        });

        for(Coord coord : coords) {
            coord.print();
        }
    }
}