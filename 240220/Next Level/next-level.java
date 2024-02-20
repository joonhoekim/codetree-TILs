import java.util.*;
import java.io.*;

class User {
    String id;
    int lv;

    User(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }

    User() {
        this.id="codetree";
        this.lv=10;
    }

    void println(){
        System.out.printf("user %s lv %d\n",this.id, this.lv);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String id = st.nextToken();
        int lv = Integer.parseInt(st.nextToken());

        
        User user1 = new User();
        User user2 = new User(id,lv);

        user1.println();
        user2.println();

        // bw.flush();
        // bw.close();
        br.close();
    }
}