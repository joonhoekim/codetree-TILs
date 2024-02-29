import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prevNumber = 0;
        int currentNumber = 0;
        int count = 0;
        int max = 1;
        for(int i=0;i<n;i++) {
            currentNumber=sc.nextInt();
            
            if(i==0 || prevNumber<currentNumber) {
                max = Math.max(++count,max);
            } else {
                count = 1;
            }
            prevNumber = currentNumber;
        }
        System.out.print(max);
    }
}