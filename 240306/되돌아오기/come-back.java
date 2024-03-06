import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n번 움직임
        int originX = 0;
        int originY = 0;
        int x = 0; //0,0 시작
        int y = 0;
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};
        int[] dirs = new int[128];
        
        dirs['W'] = 0;
        dirs['S'] = 1;
        dirs['E'] = 2;
        dirs['N'] = 3;

        int time = 0;
        for(int i=0; i<n; i++) {
            char dirCommand = sc.next().charAt(0);
            int dist = sc.nextInt();
            while(dist-->0) {
                x = x + dx[dirs[dirCommand]];
                y = y + dy[dirs[dirCommand]];
                time++;
                if(originX==x && originY==y) {
                    System.out.print(time);
                    return;
                }
            }
        }

        System.out.print(-1);
    }
}