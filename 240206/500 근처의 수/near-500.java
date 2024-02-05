import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int crs = 500;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<500 && arr[i]>max) {
                max=arr[i];
            }


            if(arr[i]>500 && arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.print(max+" "+min);
    }
}