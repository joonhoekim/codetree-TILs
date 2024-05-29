//승자가 바뀐 횟수를 구하기

import java.util.Scanner;

enum WinnerState {
    BOTH, A, B
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int changeCount = 0;
        int scoreA = 0;
        int scoreB = 0;
        WinnerState winner = WinnerState.BOTH; // 0=both, 1=a, 2=b
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char target = sc.next().toCharArray()[0];
            int change = sc.nextInt();

            if (target == 'A') {
                scoreA += change;
            } else if (target == 'B') {
                scoreB += change;
            }

            WinnerState prevWinner = winner;
            if(scoreA == scoreB) winner = WinnerState.BOTH;
            else if (scoreA > scoreB) winner = WinnerState.A;
            else winner = WinnerState.B;

            if(prevWinner != winner) changeCount++;
        }

        System.out.println(changeCount);
    }
}