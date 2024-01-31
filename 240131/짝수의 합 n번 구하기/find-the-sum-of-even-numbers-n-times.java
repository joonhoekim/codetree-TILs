import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sumOfEven = 0;
            if(a%2==1) {
                a++;
            }
            
            for(int j=a; j<=b; j+=2) {
                sumOfEven+=j;
            }
            bw.write(sumOfEven+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}