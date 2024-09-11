import java.io.*;

public class Main {
    private static int[] answer;
    private static int maxValue;
    private static int maxDigit;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        maxValue = Integer.parseInt(input[0]);
        maxDigit = Integer.parseInt(input[1]);

        answer = new int[maxDigit];
        
        choose(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void choose(int currDigit) throws IOException {
        if (currDigit == maxDigit) {
            writeResult();
            return;
        }

        for (int i = 1; i <= maxValue; i++) {
            answer[currDigit] = i;
            choose(currDigit + 1);
        }
    }

    private static void writeResult() throws IOException {
        for (int i = 0; i < maxDigit; i++) {
            bw.write(Integer.toString(answer[i]));
            bw.write(' ');
        }
        bw.newLine();
    }
}