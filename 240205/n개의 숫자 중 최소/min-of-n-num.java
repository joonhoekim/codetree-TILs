import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==minVal) {
                count++;
            }
            else if(arr[i]<minVal){
                minVal = arr[i];
                count = 1;
            }
            
        }
        System.out.print(minVal+" "+count);
    }
}