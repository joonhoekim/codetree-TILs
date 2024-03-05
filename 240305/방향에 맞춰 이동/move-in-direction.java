import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        int x=0;
        int y=0;
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            int dirNum = -1;
            if(dir=='E') {
                dirNum = 0;
            } else if (dir=='S') {
                dirNum = 1;
            } else if (dir=='W') {
                dirNum = 2;
            } else if (dir=='N') {
                dirNum = 3;
            }
            x+=dx[dirNum]*dist;
            y+=dy[dirNum]*dist;
        }
        System.out.print(x+" "+y);
    }
}