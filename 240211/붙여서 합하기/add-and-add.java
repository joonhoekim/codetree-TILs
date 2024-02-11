import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        String ab = a+b;
        String ba = b+a;

        int abVal = Integer.parseInt(ab);
        int baVal = Integer.parseInt(ba);

        int sum = abVal + baVal;


        System.out.print(sum);

    }
}