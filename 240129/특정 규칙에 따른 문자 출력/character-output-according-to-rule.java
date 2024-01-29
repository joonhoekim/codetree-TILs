import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        //분할 + 횟수 구하기
        for(int i=1; i<=n; i++){
            int atCount = i;
            int blankCount = n-i;
            
            for(int j=0; j<blankCount; j++) {
                System.out.print("  "); //doubleBlank
            }
            for(int j=0; j<atCount; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }

        for(int i=0; i<n-1; i++){
            int atCount = (n-1)-i;

            for(int j=0; j<atCount; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }

	}
}