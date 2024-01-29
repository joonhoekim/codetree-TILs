import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int StarCount = 2*n-1 - 2*i;
            int dBlankCount = i; //doubleBlank

            for(int j=0; j<dBlankCount; j++){
                System.out.print("  ");
            }
            for(int j=0; j<StarCount; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }    

        for(int i=1; i<n; i++){
            int StarCount = 2*i+1;
            int dBlankCount = n-i-1;

            for(int j=0;j<dBlankCount;j++){
                System.out.print("  ");
            }
            for(int j=0;j<StarCount;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}