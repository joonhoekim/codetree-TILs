import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c2=0;
        int c3=0;
        int c12=0;
        for(int i = 1; i<=n; i++) {
            if(i%12==0) {
                c12++;
            } else if (i%3==0) {
                c3++;
            } else if (i%2==0) {
                c2++;
            }
        }
        System.out.printf("%d %d %d",c2,c3,c12);
        
    }
}