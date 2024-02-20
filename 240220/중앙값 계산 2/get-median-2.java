import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    br.readLine();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int round = 1;
    int size = 0;
    int[] arr = new int[st.countTokens()];
    while (st.hasMoreTokens()) {
      arr[size++] = Integer.parseInt(st.nextToken());

      if (round++ % 2 == 1) {
        Arrays.sort(arr,0,size);
        bw.write(arr[size/2] + " ");
        //bw.flush();
      }
    }

    bw.flush();
    bw.close();
    br.close();

  }
}