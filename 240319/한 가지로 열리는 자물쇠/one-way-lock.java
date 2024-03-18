import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] locker = new int[3];
        for(int i=0;i<locker.length;i++)
            locker[i] = sc.nextInt();

        int count=0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=n; k++) {
                    if(Math.abs(locker[0]-i)<=2
                    ||Math.abs(locker[1]-j)<=2
                    ||Math.abs(locker[2]-k)<=2) {
                        count++;
                    }
                }    
            }    
        }

        System.out.print(count);
    }
}