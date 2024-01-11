import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //month
        if (a < 3) {
            System.out.println("Winter");
        } else if (a < 6) {
            System.out.println("Spring");
        } else if (a < 9) {
            System.out.println("Summer");
        } else if (a < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}