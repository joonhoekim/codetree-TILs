import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //int count = 0;
        int a = sc.nextInt(), b=sc.nextInt();
        for(int i=a; i<=b; i++) {
            if(i%5==0) {
                sum+=i;
                //count++;
            }
        }
        //Double avg = ((double)sum/count);
        //System.out.printf("%d %.1f",sum,avg);
        System.out.printf("%d",sum);
    }
}