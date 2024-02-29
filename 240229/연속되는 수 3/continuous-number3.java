import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 0;
        int max = 1;
        int cnt = 0;
        
        boolean prevSign = false;
        boolean curSign = false;

        for(int i=0; i<n; i++) {
            cur = sc.nextInt();
            curSign = cur<0?false:true; //false - 음수
            if(i==0) {
                cnt++;
                prevSign=curSign;
                continue;
            }

            if(prevSign!=curSign) {
                cnt = 1;
            } else {
                cnt++;
                //if(max<cnt) max = cnt;
                max = Math.max(max,cnt);
            }
            prevSign=curSign;
        }
        System.out.print(max);
    }
}