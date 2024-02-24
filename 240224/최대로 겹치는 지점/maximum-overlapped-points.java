import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[100+100+1+1]; //최대값+오프셋(음수 최소값 절대값)+[]+1부터)

        for(int i=0;i<n;i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j=x1; j<=x2; j++) {
                board[j]++;
            }
        }

        int maxIdx = 0;
        for(int i=1; i<board.length; i++) {
            if(board[i]>board[maxIdx]) {
                maxIdx = i;
            }
        }

        System.out.print(board[maxIdx]);

    }
}