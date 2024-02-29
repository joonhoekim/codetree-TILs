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
        int cnt=0;
        int max=0;
        for(int i=0; i<n; i++) {
            if(i==0 || arr[i] == arr[i-1]) {
                cnt++;
                if(max<=cnt) max = cnt + 1;
            } else {
                cnt = 0;
            }            
        }

        System.out.print(max);
    }
}