//백트래킹으로 Permutation 구현하라는 이야기는 아닌 것 같은데
//이전 문제들처럼 Idx 기준으로 뭔가 해봐야 하는 것 같다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        final int SIZE = 100+1;
        int[] arrA = new int[n];
        int[] arrB = new int[SIZE];
        
        for(int i=0;i<n;i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++) {
            int input = sc.nextInt();
            arrB[input] += 1;
        }
        int count = 0;
        for(int start=0; start<n-m+1; start++) {
            int[] arrC = new int[SIZE];
            for(int i=0; i<m; i++) {
                int input = arrA[start+i];
                arrC[input] += 1;
            }

            boolean isSameArr = true;
            for(int i=0; i<SIZE; i++) {
                if(arrB[i]!=arrC[i]) {
                    isSameArr = false;
                    break;
                } 
            }
            if(isSameArr) {
                count++;
            }
        }

        System.out.print(count);
    }
}