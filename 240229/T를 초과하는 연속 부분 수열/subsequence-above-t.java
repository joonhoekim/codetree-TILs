import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int prevNumber=0;
        int currentNumber=0;
        int count = 0;
        int max = 0;
        for(int i=0; i<n; i++) {
            currentNumber=sc.nextInt();
            if(i==0) {
                if(currentNumber>t) {
                    count++;
                }
                prevNumber = currentNumber;
                max = Math.max(count, max);
                continue;
            }

            if(prevNumber>t && currentNumber>t && currentNumber>prevNumber) {
                max = Math.max(++count +1, max);
            } else {
                count = 0;
            }
            prevNumber = currentNumber;
        }
        System.out.print(max);
    }
}