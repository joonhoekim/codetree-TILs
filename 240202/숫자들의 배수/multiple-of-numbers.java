import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiplier = 1;
        int cnt5 = 0;
        for(;;){
            int temp=n*multiplier++;
            System.out.print(temp+" ");

            if(temp%5==0) {
                cnt5++;
                if(cnt5==2){
                    break;
                }
            }
        }
    }
}