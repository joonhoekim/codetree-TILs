//백트래킹으로 Permutation 구현하라는 이야기는 아닌 것 같은데
//이전 문제들처럼 Idx 기준으로 뭔가 해봐야 하는 것 같다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[100+1];
        
        for(int i=0;i<n;i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++) {
            int input = sc.nextInt();
            arrB[input] = 1;
        }
        int ans = 0;
        for(int start=0; start<=n-m; start++) {
            int count = 0;
            for(int cursor=start; cursor<start+m; cursor++) {
                
                if(arrB[arrA[cursor]]==1) {
                    count++;
                }
            }
            if(count==m) {
                ans++;
            }
        }

        System.out.print(ans);
    }
}