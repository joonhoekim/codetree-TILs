import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int t = sc.nextInt();
        // int previous = 0;
        int current = 0;
        int max = 0;
        int count = 0;

        //더 커져야 한다는 건 조건이 아니었네....
        for (int i=0; i<n; i++) {
            current = sc.nextInt();
            if(current>t) {
                max = Math.max(max,++count);
            } else {
                count=0;
            }
        }
        System.out.print(max);
    }
}