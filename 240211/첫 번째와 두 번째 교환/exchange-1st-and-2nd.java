import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charArray = br.readLine().toCharArray();

        char first = charArray[0];
        char second = charArray[1];

        for (int i = 0; i < charArray.length; i++) {
            if (first == charArray[i]) {
                charArray[i] = second;
            } else if (second == charArray[i]) {
                charArray[i] = first;
            }
        }

        bw.write(String.valueOf(charArray));

        bw.flush();
        bw.close();
        br.close();
    }
}