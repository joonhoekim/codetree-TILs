import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int maxDiff = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int left = 1;
        int right = n;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(arr, maxDiff, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(ans);
    }
    
    static boolean isValid(int[] arr, int maxDiff, int range) {
        for (int i = 0; i <= arr.length - range; i++) {
            if (arr[i + range - 1] - arr[i] <= maxDiff) {
                return true;
            }
        }
        return false;
    }
}