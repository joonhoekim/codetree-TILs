import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    br.readLine();
    StringTokenizer st = new StringTokenizer(br.readLine());

    ArrayList<Integer> list = new ArrayList<>();
    int round = 1;
    while (st.hasMoreTokens()) {
      list.add(Integer.parseInt(st.nextToken()));

      if (round++ % 2 == 1) {
        Collections.sort(list);
        bw.write(String.valueOf(list.get(list.size() / 2)) + " ");
        bw.flush();
      }
    }

    bw.flush();
    bw.close();
    br.close();

  }
}