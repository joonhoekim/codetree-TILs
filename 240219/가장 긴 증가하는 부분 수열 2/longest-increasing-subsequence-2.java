import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        int[] lenArr = new int[n];
        for(int i=0;i<n;i++) {

            int cnt=1;
            for(int j=i; j<n-1; j++) {
                if(arr[j] < arr[j+1]) {
                    cnt++;
                } else {
                }
            }
            lenArr[i] = cnt;
        }
        Arrays.sort(lenArr);
        System.out.print(lenArr[n-1]);
    }
}