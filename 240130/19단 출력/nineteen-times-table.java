//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = 19;
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                //짝수일때와 j=19일 때 줄바꿈 해주자.
                if(j%2==0 || j==19) {
                    System.out.printf("%d * %d = %d\n",i,j,i*j);
                } else{
                    System.out.printf("%d * %d = %d / ",i,j,i*j);
                }
            }
        }



    }
}