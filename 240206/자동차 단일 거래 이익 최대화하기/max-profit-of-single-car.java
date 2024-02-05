import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int maxProfit=0;
        int minPrice=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<minPrice) {
                minPrice=arr[i];
            }
            
            int currProfit = arr[i] - minPrice;
            
            if(currProfit>maxProfit) {
                maxProfit=currProfit;
            }
        }
        System.out.print(maxProfit);
    }
}