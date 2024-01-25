import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //int count = 0;
        int a = sc.nextInt(), b=sc.nextInt();
        
        //이거 낚시조건으로 많이 나오겠다!! 예방접종 고마워!!
        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }

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