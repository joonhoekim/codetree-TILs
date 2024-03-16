import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        
        int precalculatedSum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            precalculatedSum += arr[i];
        }



        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int sum = precalculatedSum - arr[i] - arr[j];
                minDiff = Math.min(minDiff, Math.abs(sum-s));
            }
        }
        System.out.print(minDiff);
    }
}