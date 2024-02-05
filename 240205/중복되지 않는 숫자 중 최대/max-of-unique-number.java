import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxVal = 1001;
        int[] count = new int[maxVal]; //이게 좋은 건 아닌 것 같지만..
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
            count[arr[i]]++;
        }

        for(int i=maxVal-1;i>=0;i--) {
            if(count[i]==1){
                System.out.print(i);
                return;
            }
        }

        System.out.print(-1);


        
    }
}