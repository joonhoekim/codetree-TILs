import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            int input = sc.nextInt();
            if(input == 1){
                System.out.println("John");
            } else if(input == 2){
                System.out.println("Tom");
            } else if(input == 3){
                System.out.println("Paul");
            } else if(input == 4){
                System.out.println("Sam");
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}