import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int rollCall = sc.nextInt();
        if (rollCall == 1) {
            System.out.println("John");
        } else if (rollCall == 2) {
            System.out.println("Tom");
        } else if (rollCall == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}