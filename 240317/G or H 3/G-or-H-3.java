import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        final int SIZE = 10_000 + 1;
        int[] arr = new int[SIZE]; 

        for(int i=0; i<n; i++) {
            int position = sc.nextInt();
            char alphabet = sc.next().charAt(0);
            
            arr[position] = (int) alphabet;
        }

        int maxScore = 0;
        for(int i=0; i<SIZE-k; i++) {
            int score = 0;
            for(int scan=i; scan<=i+k; scan++) {
                if(arr[scan] == 'G') {
                    score += 1;
                } else if(arr[scan] == 'H') {
                    score += 2;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}