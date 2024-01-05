import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int subtraction = sc.nextInt() - sc.nextInt();
        if (subtraction < 0) {
            subtraction = subtraction * -1;
        }
        System.out.print(subtraction);

    }
}