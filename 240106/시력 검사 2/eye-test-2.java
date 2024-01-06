import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double eyesight = sc.nextDouble();

        if (eyesight >= 1.0) {
            System.out.println("High");
        } else if (eyesight >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}