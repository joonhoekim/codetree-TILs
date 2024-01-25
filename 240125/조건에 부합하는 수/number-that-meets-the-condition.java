import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            if(
                (i%2==0 && i%4!=0) ||
                ((i/8)%2==0) ||
                ((i%7)<4)
            ) {
                continue;
            }
            System.out.printf("%d ",i);
        }
        
    }
}