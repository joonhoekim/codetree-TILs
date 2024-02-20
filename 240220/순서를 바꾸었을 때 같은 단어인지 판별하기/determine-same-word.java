import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<str1.length;i++){
            if(str1[i] != str2[i]) {
                bw.write("No");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        bw.write("Yes");
        bw.flush();
        bw.close();
        br.close();
    }
}