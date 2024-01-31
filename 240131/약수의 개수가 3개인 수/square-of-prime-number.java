import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int countSatisfied = 0;
        for(int i=a; i<=b; i++){
            int sumCount = 2;
            // 1과 자기자신은 언제나 약수이다.
            for( int j=2; j<i; j++) {
                if (i%j==0) {
                    sumCount++;
                }
            }
            if(sumCount==3) {
                countSatisfied++;
            }
        }
        System.out.print(countSatisfied);
    }
}