import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String[] input = br.readLine().split(" ");
        char[] cArr = input[0].toCharArray();
        int q = Integer.parseInt(input[1]);
        for(int i=0; i<q; i++){
            String[] query = br.readLine().split(" ");
            int type = Integer.parseInt(query[0]);
            if(type==1){
                int a = Integer.parseInt(query[1]);
                int b = Integer.parseInt(query[2]);
                char temp = cArr[a-1];
                cArr[a-1] = cArr[b-1];
                cArr[b-1] = temp;
            } else if(type == 2){
                for(int j=0;j<cArr.length;j++){
                    if(cArr[j]==query[1].charAt(0)){
                        cArr[j]=query[2].charAt(0);
                    }
                }
            }

            bw.write(String.valueOf(cArr));
            bw.write("\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}