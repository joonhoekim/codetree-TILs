import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //땅 개수
        int h = sc.nextInt(); //타겟 높이
        int t = sc.nextInt(); //최소 구간(이상)
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt(); //idx = 땅 위치 

        int minCost = Integer.MAX_VALUE;
        for(int start=0; start<n; start++){
            int cost = 0;
            for(int cursor=start; cursor<start+t; cursor++) {
                if(!inRange(cursor,0,n-1)) {
                    cost = Integer.MAX_VALUE;
                    break;
                }

                cost+=Math.abs(arr[cursor]-h);
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
        
        
    }

    static boolean inRange(int tested, int start, int end) {
        if(start <= tested && tested<=end) {
            return true;
        }
        return false;
    }
}