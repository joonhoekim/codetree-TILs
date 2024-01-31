import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev=0;
        for(int i=0;i<10;i++) {
            int input = sc.nextInt();
            if(input%3==0) {
                break;
            }
            prev = input;
        }
        System.out.print(prev);
    }
}