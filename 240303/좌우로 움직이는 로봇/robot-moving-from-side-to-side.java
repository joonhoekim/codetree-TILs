//풀이. 인덱스=시간, 값=위치로 시뮬레이션

import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int maxRange=1_000_001;
        int[] robotA = new int[maxRange];
        int[] robotB = new int[maxRange];

        int n = sc.nextInt();
        int m = sc.nextInt();
        execCommands(robotA, n);
        execCommands(robotB, m);
        countEncounter(robotA, robotB, maxRange);      
    }

    static void execCommands(int[] timetable, int noc) { //number of commandlines
        int time=0;
        int v=1;
        int lastPosition = 0;
        for(int commandIdx=0; commandIdx<noc; commandIdx++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='R') {
                while(t-->0) {
                    timetable[time+1] = timetable[time] + v;
                    time++;
                }
            } else if(d=='L') {
                while(t-->0) {
                    timetable[time+1] = timetable[time] - v;
                    time++;
                }
            }
            if(commandIdx == noc-1) {
                lastPosition = timetable[time];
            }
        }

        for(int i=time; i<timetable.length; i++) {
            timetable[i] = lastPosition;
        }
    }

    static void countEncounter(int[] a, int[] b, int searchRange) {
        //encounter condition
        //1. each position is not same.
        //2. 기록 끝난 부분에서 0으로 변하는데 이 때 만나는 것으로 카운트되지 않도록 주의
        int count=0;
        for(int i=1; i<searchRange; i++) {
            
            if(a[i-1] != b[i-1]) {
                if(a[i] == b[i]) {
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }
}