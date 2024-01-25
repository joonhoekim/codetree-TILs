import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int product=1;
        for(int i=a; i<=b; i++){
            //if(i%6==0 && i%8!=0)
            product*=i;
        }
        
        // double avg = (double)sum / n;
        //System.out.printf("%d %.1f",sum,avg);
        System.out.printf("%d",product);
        
    }
}