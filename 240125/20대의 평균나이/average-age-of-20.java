import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (;;) {
            int input = sc.nextInt();
        
            if(input<20 || 29<input) {
                System.out.printf("%.2f", (double)sum/count );
                break;
            }

            count++;
            sum+=input;
        }
    }
}