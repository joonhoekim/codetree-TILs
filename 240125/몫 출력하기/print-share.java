import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        for (;;) {
            if(count==3) {
                break;
            }
            int input = sc.nextInt();
            if(input%2==1) {
                continue;
            } else {
                System.out.println(input/2);
                count++;
            }
        }
    }
}