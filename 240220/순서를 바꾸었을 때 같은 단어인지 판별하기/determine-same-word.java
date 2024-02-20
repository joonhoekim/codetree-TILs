import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int len1 = str1.length;
        int len2 = str2.length;
        if(len1 != len2) {
            bw.write("No");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
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