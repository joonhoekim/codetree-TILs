import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<2*n-1; i++) {
            if(i<n) {
                count++;
            } else {
                count--;
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.print("\n\n");
        }
    }
}