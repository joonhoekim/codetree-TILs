import java.util.Scanner;

public class Main {


    static void boomerang(int n) {
        if(n==0) {
            return;
        }
        System.out.print(n+" ");
        boomerang(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boomerang(n);
    }
}