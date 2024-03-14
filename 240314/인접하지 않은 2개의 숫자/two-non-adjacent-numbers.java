import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //완전탐색 / 조건 안맞으면 continue;
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(Math.abs(i-j) > 1) {
                    max = Math.max(max, arr[i]+arr[j]);
                }
            }
        }

        System.out.print(max);
    }
}