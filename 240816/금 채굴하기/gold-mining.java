import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        field = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxGold = 0;
        for (int k = 0; k <= n + 1; k++) {
            int cost = calculateCost(k);
            
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    int gold = calculateGold(r, c, k);
                    if (gold * m - cost >= 0) {
                        maxGold = Math.max(maxGold, gold);
                    }
                }
            }
        }

        System.out.println(maxGold);
    }

    static int calculateCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }

    static int calculateGold(int centerR, int centerC, int k) {
        int gold = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (Math.abs(r - centerR) + Math.abs(c - centerC) <= k) {
                    gold += field[r][c];
                }
            }
        }
        return gold;
    }
}