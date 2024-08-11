import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int oddCount = 0;
        int evenCount = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        bw.write(String.valueOf(solve(oddCount,
                                      evenCount)));

        bw.flush();
        bw.close();
        br.close();
    }

    static int solve(int oddCount, int evenCount) {

        if (evenCount == oddCount) {
            return oddCount * 2;
        } else if (evenCount > oddCount) {
            return oddCount * 2 + 1;
        } else {
            int x = (oddCount - evenCount) / 3;
            
            if(x==0) x++;

            oddCount -= 2 * x;
            evenCount += x;

            return solve(oddCount,
                         evenCount);


        }
    }
}