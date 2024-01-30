import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n; j++){
                if(count==10){
                    count=1;
                }
                System.out.printf("%d", count++);
            }
            System.out.print("\n");
        }       
    }
}