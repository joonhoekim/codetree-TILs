import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt(), b=sc.nextInt();
        for(int i=a; i<=b; i++) {

            sum+=i;
        }
        System.out.print(sum);
    }
}