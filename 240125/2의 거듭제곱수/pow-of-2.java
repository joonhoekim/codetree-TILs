import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(;;){
            n/=2;
            x++;
            if(n==1) {
                break;
            }
        }
        System.out.print(x);
    }
}