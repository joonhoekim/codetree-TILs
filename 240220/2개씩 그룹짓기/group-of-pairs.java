import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0;i<2*n; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int[] sum = new int[n];
        for(int i=0;i<n;i++) {
            sum[i]=arr[i]+arr[2*n-i-1];
        }
        Arrays.sort(sum);
        System.out.print(sum[n-1]);
    }
}