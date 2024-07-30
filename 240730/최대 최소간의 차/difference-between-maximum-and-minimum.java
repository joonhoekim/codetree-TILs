import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int left = 0, right = 0;
        int maxLength = 0;
        int bestLeft = 0, bestRight = 0;
        
        while (right < n) {
            if (arr[right] - arr[left] <= k) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    bestLeft = left;
                    bestRight = right;
                }
                right++;
            } else {
                left++;
            }
        }
        
        long cost = 0;
        for (int i = 0; i < bestLeft; i++) {
            cost += arr[bestLeft] - arr[i];
        }
        for (int i = bestRight + 1; i < n; i++) {
            cost += arr[i] - arr[bestRight];
        }
        
        System.out.println(cost);
    }
}