import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int [n];
        int INT_MIN = Integer.MIN_VALUE;
        int max = INT_MIN;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}