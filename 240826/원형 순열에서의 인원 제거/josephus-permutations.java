import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = i + 1;
        }
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = (index + k - 1) % (n - i);
            bw.write(String.valueOf(people[index]));
            
            if (i < n - 1) {
                bw.write(" ");
                System.arraycopy(people, index + 1, people, index, n - i - index - 1);
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}