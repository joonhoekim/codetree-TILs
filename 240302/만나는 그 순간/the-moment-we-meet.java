//처음 접근할 때
//인덱스=위치, 값=지나간 시간(초) 으로 크게 고민하지 않고 시작했는데
//이렇게하니까 위치 돌아오면 시간이 덮어씌워지는 문제가 생기고
//이 덮어씌워지기 전의 값인 시간이 서로 같을 수 있었음...
//인덱스=시간, 값=위치로 두는 경우는 문제되지 않음...
//이런 데이터 기록형 시뮬레이션에서, 접근을 잘못해서 덮어씌워지는 문제를 눈치채지 못하는 경우를 조심해야겠다.

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();


        int maxSaving = (n>m?n:m) * 1000 + 1;
        int minSaving = (n<m?n:m) * 1000 + 1;
        
        int[] timetableA = new int[maxSaving];
        int[] timetableB = new int[maxSaving];

        exec(timetableA, n);
        exec(timetableB, m);
        System.out.print(getFirstEncounter(timetableA, timetableB, minSaving));

        
    }

    static int getFirstEncounter(int[] timetableA, int[] timetableB, int searchRange) {
        for(int i=1; i<searchRange; i++) {
            if (timetableA[i]==timetableB[i]) {
                return i;
            }
        }
        return -1;
    }

    static void exec(int[] timetable, int numberOfLines) {

        int time = 0;
        int position = 0;
        
        for(int i=0; i<numberOfLines; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            if(direction=='R') {
                while(--distance>=0) {
                    timetable[++time] = ++position;
                }
            } else if(direction=='L') {
                while(--distance>=0) {
                    timetable[++time] = --position;
                }
            }
        }
    }
}