import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){ //이렇게 풀면 4사분면이 아니라 1사분면 모양이 된다.
            for(int j=n;j>=1;j--){
                if(i==n || j==1) {
                    System.out.print("* ");
                } else if(j>i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
}