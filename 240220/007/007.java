import java.util.*;
import java.io.*;

class Secret {
    String code;
    char point;
    int time;
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Secret secret = new Secret();

        secret.code = st.nextToken();
        secret.point = st.nextToken().charAt(0);
        secret.time = Integer.parseInt(st.nextToken());
        
        bw.write("secret code : " + secret.code + "\n");
        bw.write("meeting point : " + secret.point+ "\n");
        bw.write("time : " + secret.time+ "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}