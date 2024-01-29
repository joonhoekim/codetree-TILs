import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count=n*2+1;

        for(int i=1;i<=count;i++){
            for(int j=1;j<=count;j++){
                if(i%2==0 && j%2==0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}