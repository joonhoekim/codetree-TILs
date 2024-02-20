import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] str1 = br.readLine().toCharArray();
    char[] str2 = br.readLine().toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);

    if (Arrays.toString(str1).equals(Arrays.toString(str2))) {
      bw.write("Yes");
    } else {
      bw.write("No");
    }

    bw.flush();
    bw.close();
    br.close();
    return;

  }
}