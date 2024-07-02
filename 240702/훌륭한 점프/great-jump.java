import java.util.*;

public class Main {

    static final int MAX_VAL = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //stone bridge, number of stones.
        int maxDiff = sc.nextInt(); //max jump length.
        
        int[] arr = new int[n];
        int[] arrCopied = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int outerMin = Integer.MAX_VALUE;
        for(int innerMax=MAX_VAL; innerMax >= Math.max(arr[0], arr[n-1]); innerMax--) {
            if(isPossible(innerMax, arr, maxDiff))
                outerMin = Math.min(outerMin, innerMax);
        }

        System.out.println(outerMin);
    }

    static boolean isPossible(int innerMax, int[] arr, int maxDiff) {
        int[] availableIndexes = new int[arr.length];
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= innerMax) {
                availableIndexes[count++] = i;
            }
        }

        for(int i=1; i<count; i++) {
            int dist = availableIndexes[i] - availableIndexes[i-1];
            if(dist>maxDiff) {
                return false;
            }
        }

        return true;
    }
}