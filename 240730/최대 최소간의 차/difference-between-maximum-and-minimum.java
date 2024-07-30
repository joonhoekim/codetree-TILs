import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        
        long result = Long.MAX_VALUE;
        for (int lower = min; lower <= max; lower++) {
            int upper = lower + k;
            long cost = 0;
            for (int num : arr) {
                if (num < lower) cost += lower - num;
                else if (num > upper) cost += num - upper;
            }
            result = Math.min(result, cost);
        }
        
        bw.write(String.valueOf(result));
        bw.newLine();
        
        bw.flush();
        bw.close();
        br.close();
    }
}