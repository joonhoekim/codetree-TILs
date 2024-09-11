import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> answer = new LinkedList<>();
    static int maxValue;
    static int maxDigit;
    static List<String> results = new LinkedList<>(); // 결과를 저장할 리스트

    static void choose(int currDigit) {
        if (currDigit == 0) {
            saveResult();
            return;
        }

        for (int i = 1; i <= maxValue; i++) {
            answer.add(i);
            choose(currDigit - 1);
            answer.remove(answer.size() - 1);
        }
    }

    static void saveResult() {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : answer) {
            sb.append(integer).append(" ");
        }
        results.add(sb.toString());
    }

    static void printResults() {
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        int k = sc.nextInt();
        int n = sc.nextInt();
        maxValue = k;
        maxDigit = n;

        choose(maxDigit);
        printResults(); // 모든 결과를 한 번에 출력
    }
}