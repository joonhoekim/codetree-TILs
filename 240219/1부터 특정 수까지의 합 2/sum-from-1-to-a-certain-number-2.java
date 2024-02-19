import java.util.Scanner;

public class Main {
    static int seriesSum(int n){
        if(n==1) {
            return 1;
        }
        return seriesSum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(seriesSum(n));
    }
}