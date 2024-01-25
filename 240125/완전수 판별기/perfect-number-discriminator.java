import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        for(int i=1; i<input; i++){
            if(input%i==0) {
                sum+=i;
            }
        }
        if(sum == input) {
            System.out.print("P");
        } else {
            System.out.print("N");

        }
    }
}