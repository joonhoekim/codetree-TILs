import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int input = sc.nextInt();
            if(input%2==1 && input%3==0) 
            sum+=input;
        }
        System.out.print(sum);
    }
}