import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(countMystics(start, end));
    }

    static int countMystics(int start, int end) {
        int count = 0;
        for (int number = start; number <= end; number++) {
            int[] arr = new int[10];
            int test = number;
            while(test > 0) {
                arr[test%10]++;
                test/=10;
            }

            int oneCount = 0;
            int elseCount = 0;
            for (int i = 0; i < 10; i++) {
                //한개만 다른지?
                if(arr[i]==1) {
                    oneCount++;
                }
                if(arr[i]>=2) {
                    elseCount++;
                }
            }

            if(oneCount==1 && elseCount==1) {
                count++;
            } else if (oneCount==2 && elseCount==0) {
                count++;
            }
        }

        return count;
    }
}