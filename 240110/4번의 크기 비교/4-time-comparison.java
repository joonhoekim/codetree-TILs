import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        for(int i = 0; i<input.length; i++) {
            input[i] = sc.nextInt();
        }
        for(int i = 1; i<input.length; i++) {
           if(input[0] > input[i]) {
            System.out.println("1");
           }  else {
            System.out.println("0");
           }
        }
    }
}