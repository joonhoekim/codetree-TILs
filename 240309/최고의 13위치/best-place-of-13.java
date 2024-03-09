import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rn = 3;
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int[] cutted;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-rn+1; j++) {
                cutted = Arrays.copyOfRange(board[i],j,j+rn);
                int sum = 0;
                for(int k=0; k<cutted.length; k++) {
                    sum+=cutted[k];
                }
                max = Math.max(sum, max);
            }
        }
        System.out.print(max);
    }
}