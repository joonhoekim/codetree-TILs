import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100; // sc.nextInt();
        
        int[] arr = new int[n];
        int last=100;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
            if(arr[i]==0) {
                //사이즈를 매번 구할 필요없이 마지막 i만 받아오면 됨
                last = i; 
                break;
            }
        }
        int sum = arr[--last] + arr[--last] + arr[--last];
        System.out.printf("%d",sum);

    }
}