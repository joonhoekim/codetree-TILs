import java.util.*; //namespace 꼬일 일이 여기서는 없으므로... 애스터리스크를 사용했다.
//position[time] = absolute position;
//조합 바뀌는 경우는?
//이전 명예의 전당과 지금 명예의 전당이 다른지를 단위시간마다 검사

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tA = new int[n];
        int[] tB = new int[m];
        int[] vA = new int[n];
        int[] vB = new int[m];
        

        int totalTime = 0; //A, B 총시간 같은 것은 조건
        for(int i=0; i<n; i++) {
            vA[i] = sc.nextInt();
            tA[i] = sc.nextInt();
            totalTime += tA[i];
        }
        totalTime++;

        for(int i=0; i<m; i++) {
            vB[i] = sc.nextInt();
            tB[i] = sc.nextInt();
        }

        int[] timePositionA = new int[totalTime];
        int[] timePositionB = new int[totalTime];

        int time = 0;
        for(int i=0; i<n; i++) {
            while(tA[i]-->0) {
                timePositionA[time+1]= timePositionA[time]+vA[i];
                time++;
            }
        }

        time = 0;
        for(int i=0; i<m; i++) {
            while(tB[i]-->0) {
                timePositionB[time+1] = timePositionB[time]+vB[i];
                time++;
            }
        }

        int count = 1;
        for(int i=1; i<totalTime-1; i++) {
            int curdiff = timePositionA[i] - timePositionB[i];
            int nextdiff = timePositionA[i+1] - timePositionB[i+1];
            if (curdiff==0 && nextdiff==0) {
                continue;
            } else if (curdiff * nextdiff == 0) {
                count++;
            } else if (curdiff * nextdiff < 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}