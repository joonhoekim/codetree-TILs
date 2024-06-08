import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int[] arrCloned = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      arrCloned[i] = arr[i];
    }

    Arrays.sort(arrCloned);
    int min = arrCloned[0];
    int max = arrCloned[n-1];

    int globalSatisfiedCount = 0;
    for(int k=min+1; k<max; k++) {
      int localSatisfiedCount = 0;
      for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
          if(Math.abs(arr[i]-k) == Math.abs(arr[j]-k)) {
            localSatisfiedCount++;
          }
        }
      }
      if(localSatisfiedCount > globalSatisfiedCount) {
        globalSatisfiedCount = localSatisfiedCount;
      }
    }
    bw.write(String.valueOf(globalSatisfiedCount));
    bw.flush();
    bw.close();
    br.close();
  }
}