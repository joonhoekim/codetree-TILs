import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int maxDiff = sc.nextInt();

        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;
        
        loop: for(int range=arr.length; range>0; range--) {
            for(int startIdx=0; startIdx<=arr.length-range; startIdx++) {
                if(sol(arr, maxDiff, startIdx, range)) {
                    ans = range;
                    break loop;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean sol(int[] arr, int maxDiff, int startIdx, int range) {
        if(arr[startIdx+range-1] - arr[startIdx] <= maxDiff ) {
            return true;
        }

        return false;
    }
}