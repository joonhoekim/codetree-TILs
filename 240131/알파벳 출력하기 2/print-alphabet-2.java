import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char cnt = 'A';

        for(int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<n; j++) {
                if(cnt=='Z') cnt='A';

                System.out.print(cnt++ + " ");
            }
            System.out.print("\n");
        }
    }
}