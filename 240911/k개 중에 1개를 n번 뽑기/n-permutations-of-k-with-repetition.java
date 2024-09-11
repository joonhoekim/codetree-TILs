import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer> answer = new LinkedList<>();
    static int maxValue;
    static int maxDigit;

    static void choose(int currDigit) throws IOException {
        if (currDigit == 0) {
            print();
            return;
        }

        for (int i = 1; i <= maxValue; i++) {
            answer.add(i);
            choose(currDigit - 1);
            answer.remove(answer.size() - 1);
        }
    }

    static void print() throws IOException {
        for (Integer integer : answer) {
            bw.write(integer.toString());
            bw.write(" ");
        }
        bw.newLine();
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        maxValue = Integer.parseInt(input[0]);
        maxDigit = Integer.parseInt(input[1]);

        choose(maxDigit);

        bw.flush();
        bw.close();
        br.close();
    }
}