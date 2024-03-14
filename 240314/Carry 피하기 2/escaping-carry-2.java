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
                for(int k=j+1; k<n-2; k++) {
                    boolean haveCarry = false;

                    for(int exponent=0; exponent<4; exponent++) {
                        int divider = (int) Math.pow(10, exponent+1);
                        int first = arr[i]/divider%10;
                        int second = arr[j]/divider%10;
                        int third = arr[k]/divider%10;
                        if(first+second+third>=10) {
                            haveCarry = true;
                        }
                    }
                    if(haveCarry) {
                        continue;
                    } else {
                        int first = arr[i];
                        int second = arr[j];
                        int third = arr[k];
                        max = Math.max(max, first+second+third);
                    }
                }
            }
        }

        System.out.print(max);
    }
}