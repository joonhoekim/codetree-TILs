import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int maxP = 0;
        for(int i=0; i<n; i++) {
            //각 연도에서 앞 년도에 대한 최대 이익 구함
            for(int j=i+1; j<n; j++) {
                int p = arr[j]-arr[i];
                if(p>maxP) {
                    maxP=p;
                }
            }
        }

        System.out.print(maxP);
        
    }
}