import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] input = new int[2];
        for(int i = 0; i<input.length; i++) {
            input[i] = sc.nextInt();
            
            if (input[i]%2==0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }


    }
}