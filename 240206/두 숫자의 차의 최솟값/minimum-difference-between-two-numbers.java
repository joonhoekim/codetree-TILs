import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                int curDiff = arr[i]-arr[j];
                if(curDiff<0) {
                    curDiff *= -1;
                }

                if(curDiff<minDiff){
                    minDiff=curDiff;
                }
            }
        }

        System.out.print(minDiff);
    }
}