import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int engA = sc.nextInt();
        int mathB = sc.nextInt();
        int engB = sc.nextInt();

        if(mathA>mathB && engA>engB) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}