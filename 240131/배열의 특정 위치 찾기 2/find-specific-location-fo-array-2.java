import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // sc.nextInt();
        int[] arr = new int[n];

        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if( i%2==0 ) { //홀수
                sumOdd+=arr[i];
            } else {
                sumEven+=arr[i];
            }
        }

        int ans=sumOdd-sumEven;
        if(ans<0){
            ans=ans*-1;
        } 

        System.out.print(ans);
    }
}