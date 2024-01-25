import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;){
            int input = sc.nextInt();
            if(input==25){
                System.out.println("Good");
                break;
            } else if(input>25){
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
        }
    }
}