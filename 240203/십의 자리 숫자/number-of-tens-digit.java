import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digit_10 = new int[10];
        for(;;){
            int input = sc.nextInt();
            if(input==0){
                break;
            }
            digit_10[input/10]++;
        }       

        for(int i=1; i<10; i++) {
            System.out.printf("%d - %d\n",i,digit_10[i]);
        }
    }
}