import java.util.*;

public class Main {

    static String toBinary(int n){
        // new int[100] 같은 식으로 푸는 것보다 SB 쓰는 게 좋을 것 같다.
        StringBuilder sb = new StringBuilder();
        if(n==0) {
            return "0";
        }
        while(true) {
            if(n==1) {
                sb.append(n);
                break;
            } else if(n==0) {
                break;
            }
            sb.append(n%2);
            n/=2;
        }
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(toBinary(n));
    }
}