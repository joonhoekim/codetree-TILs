import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int cnt=0;
        for(int i=0; i<m; i++) {
            int n = sc.nextInt();

            for(;;){
                if(n%2==0) {
                    n=n/2;
                } else {
                    n=n*3 +1;
                }
                cnt++;

                if(n==1){
                    
                    break;
                }
            }
        System.out.println(cnt);
        cnt=0;
        }
        
        
    }
}