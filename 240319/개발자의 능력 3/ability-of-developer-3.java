import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;
        int[] devs = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            devs[i]=sc.nextInt();
            sum += devs[i];
        }
        
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    int team1 = devs[i]+devs[j]+devs[k];
                    int team2 = sum - team1;
                    int diff = Math.abs(team1-team2);
                    minDiff = Math.min(minDiff, diff);
                }
            }
        }

        System.out.print(minDiff);
    }

    static boolean isIn(int input, int start, int end) {
        if(start <= input && input <= end) {
            return true;
        }
        return false;
    }
}