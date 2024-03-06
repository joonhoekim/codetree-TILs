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

        int ans = -1; //못찾았을 경우 -1을 반환해야 하는 것을 작성 중 까먹지 않도록 ans 변수 사용
        int time = 0;
        for(int i=0; i<n; i++) {
            char dirCommand = sc.next().charAt(0);
            int dist = sc.nextInt();
            while(dist-->0) {
                x = x + dx[dirs[dirCommand]];
                y = y + dy[dirs[dirCommand]];
                time++;
                if(originX==x && originY==y) { // 되돌아 오는 경우 문제가 원하는 시간 출력하고 종료
                    ans = time;
                    System.out.print(ans);
                    return;
                }
            }
        }

        System.out.print(ans);
    }
}