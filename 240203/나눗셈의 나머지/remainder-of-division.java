import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b=sc.nextInt();
        int[] residueCount = new int[10];
        for(;;){
            int divider = a/b;
            int residue = a%b;

            residueCount[residue]++;        
            a=divider;
            
            if(divider <= 1) {
                break;
            }

        }

        int sum=0;
        for(int i=0;i<10;i++){

            int temp = residueCount[i]*residueCount[i];
            sum+=temp;
        }
        System.out.print(sum);
    }
}