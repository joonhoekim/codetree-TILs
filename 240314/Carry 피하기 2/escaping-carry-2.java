import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //1부터 10000까지이므로, 1, 10, 100, 1000, 10000 (자리수)를 검사하면 된다.
        //서로 다른 3개를 고른다. 10000자리에서 캐리가 발생할 일(100000 이상이 됨)은 없으므로 검사안해도 된다.
        int max = -1;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    boolean haveCarry = false;

                    for(int exponent=0; exponent<6; exponent++) {
                        // divide by base^N = shift to right N
                        // mode by base = getLastDigit
                        int divider = (int) Math.pow(10, exponent); 

                        int first = arr[i]/divider%10;
                        int second = arr[j]/divider%10;
                        int third = arr[k]/divider%10;
                        if(first+second+third>=10) {
                            haveCarry = true;
                            break;
                        }
                    }
                    if(!haveCarry) {
                        int sum = arr[i] + arr[j] + arr[k];
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.print(max);
    }
}