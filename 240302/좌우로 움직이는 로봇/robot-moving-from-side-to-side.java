import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = 50_000;

        //idx is time, value is position
        int[] rb1 = new int[size];
        int[] rb2 = new int[size];

        int n = sc.nextInt();
        int m = sc.nextInt();

        exec(rb1, n);
        exec(rb2, m);
        
        int count=0;
        for(int i=1; i<size; i++) {
            //로봇 이전 위치가 같지 않은데 같아진 경우만 카운트
            if(rb1[i-1] != rb2[i-1]) {
                if(rb1[i] == rb2[i]) {
                    count ++;
                }
            }

            //사용되지 않은 시간대를 발견하면 더 빨리 종료
            if( (rb1[i]==0 && rb2[i]==0) && (rb1[i-1]==0 && rb2[i-1]==0)) {
                break;
            }
        }

        System.out.print(count);
    }

    static void exec(int[] arr, int n) {
        int time=0;
        for(int i=0;i<n;i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int v = 1;

            while(t-->0) {
                if(d=='R'){
                    arr[++time] = arr[time]+v; 
                } else if (d=='L') {
                    arr[++time] = arr[time]-v; 
                }
            }
        }

    }
}