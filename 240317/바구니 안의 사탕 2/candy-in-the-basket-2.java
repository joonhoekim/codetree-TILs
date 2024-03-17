import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        final int SIZE = 100+1;
        int[] oneDimension = new int[SIZE];
        for(int i=0; i<n; i++) {
            int numberOfCandy = sc.nextInt();
            int pos = sc.nextInt();
            oneDimension[pos] += numberOfCandy;
        }
        int maxCandy = 0;
        for(int center = k; center < SIZE - k; center++) {
            int sumCandy = 0;
            for(int scan = center-k; scan <= center+k; scan++) {
                sumCandy += oneDimension[scan];
            }
            maxCandy = Math.max(maxCandy, sumCandy);
        }

        System.out.println(maxCandy);
    }
}