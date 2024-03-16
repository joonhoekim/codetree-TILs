import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int sum = 0;
                for(int order=0; order<n; order++) {
                    if(order==i || order==j) {
                        continue;
                    }
                    sum+=arr[order];
                    minDiff = Math.min(minDiff, Math.abs(sum-s));
                }
            }
        }
        System.out.print(minDiff);
    }
}