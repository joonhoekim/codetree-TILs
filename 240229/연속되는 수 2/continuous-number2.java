import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int size = n;
        int[] arr = new int[size];

        //setting
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        //counting
        int cnt=1;
        int max=1;
        for(int i=0; i<n-1; i++) {
            // 1. i 와 i-1 비교
            // 2. i==0 인 경우? 무조건 길이 1 시작
            // 7 7 7 2
            if(arr[i]==arr[i+1]) {
                ++cnt;
                if(max<=cnt) max = cnt;
            } else {
                cnt = 1;
            }            
        }

        System.out.print(max);
    }
}