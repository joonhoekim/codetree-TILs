import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }


        int[] incrSubseqLen = new int[n]; 
        for(int i=0;i<n;i++){
            //i번째 원소를 기준으로 수열 길이를 구해 배열에 저장한다. (O(n)=n^2 인 단점이 있지만 떠오른 방법..)
            int cursor = arr[i];
            int cnt=1;
            for(int j=i; j<n-1; j++) {
                if(cursor<arr[j+1]) {
                    cursor=arr[j+1];
                    cnt++;
                }
            }
            incrSubseqLen[i] = cnt;
        }

        Arrays.sort(incrSubseqLen);
        System.out.print(incrSubseqLen[n-1]);
        
    }
}