import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int starCount = (2*n - 1) - 2*i;
            //int doubleBlankCount = i;

            for(int k=0; k<i; k++) {
                System.out.print("  ");//doubleBlank
            }

            for(int j=0;j<starCount;j++){
                System.out.print("* ");
            }

            System.out.print("\n");
        }

    }
}