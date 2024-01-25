import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        

        for(int i=1; i<=10; i++) {
            int input = sc.nextInt();
            if(0<=input && input <=200) {
                sum+=input;
                count++;
            }
        }
        Double avg = ((double)sum/count);
        System.out.printf("%d %.1f",sum,avg);
        //System.out.printf("%d",sum);
    }
}