import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double m = (double) sc.nextInt() / 100;
        double kg = (double) sc.nextInt();
        int bmi = (int)(kg / (m*m));

        System.out.println(bmi);
        if(bmi>=25) {
            System.out.print("Obesity");
        }
        




    }
}