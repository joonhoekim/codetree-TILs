import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double ft = cm*30.48D;
        System.out.printf("%.1f",ft);


    }
}