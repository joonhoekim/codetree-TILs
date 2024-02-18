import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        calc(a,b);
    }

    static void calc(int a, int b){
        if(a>b) {
            a+=25;
            b*=2;
            System.out.print(a+" "+b);

        } else {
            b+=25;
            a*=2;
            System.out.print(a+" "+b);
        }
    }
}