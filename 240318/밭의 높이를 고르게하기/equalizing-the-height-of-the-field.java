import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //length of area
        int t = sc.nextInt(); //target length
        int h = sc.nextInt(); //target height
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for(int start = 0; start <= n-t; start++ ) {
            
            int cost = 0;
            for(int cursor = start; cursor < start+t; cursor++) {
                cost += Math.abs(arr[cursor] - h);
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}