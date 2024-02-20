import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    String T = st.nextToken();
    String[] arr = new String[n];

    for (int i = 0; i < n; i++) {
      arr[i] = br.readLine();
    }

    Arrays.sort(arr);

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i].startsWith(T)) {
        if (++cnt == k) {
          bw.write(arr[i]);
          bw.flush();
          break;
        }
      }
    }

    bw.flush();
    bw.close();
    br.close();

  }
}