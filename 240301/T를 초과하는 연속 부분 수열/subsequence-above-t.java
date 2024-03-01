import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i=0;i<n;i++) {
          arr[i]=sc.nextInt();  
        }

        int count = 0;
        if(arr[0]>t) count++;
        for(int i=1; i<n-1; i++) {

            if(arr[i]>t && arr[i+1] > arr[i]) {
                if(count == 1) {
                    count = 2;
                }
                max = Math.max(max, ++count);
            } else {
                count = 1;
            }
        }

        System.out.print(max);
    }
}