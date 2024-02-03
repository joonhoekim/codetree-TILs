import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score_10 = new int[10];
        for(;;){
            int input = sc.nextInt();
            if (input == 0){
                break;
            }
            score_10[input/10 -1]++;
        }

        for(int i=0; i<10; i++) {
            System.out.printf("%d - %d\n",(10-i)*10, score_10[9-i]);
        }
        
    }
}