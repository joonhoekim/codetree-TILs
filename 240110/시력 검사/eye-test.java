import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(a >= 1.0 && b >= 1.0) {
            System.out.println("High");
        } else{
            System.out.println("Low");
        }

    }
}