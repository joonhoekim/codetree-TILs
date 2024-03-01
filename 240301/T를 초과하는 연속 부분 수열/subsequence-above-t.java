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
        for(int i=1; i<n-1; i++) {

            if(arr[i]>t && arr[i+1] > arr[i]) {
                if(count==0){
                    count=1;
                }
                max = Math.max(max, ++count);
            } else {
                count = 0;
            }
        }

        System.out.print(max);
    }
}