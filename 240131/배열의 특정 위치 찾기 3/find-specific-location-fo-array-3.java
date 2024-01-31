import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100; // sc.nextInt();
        
        int[] arr = new int[n];
        int size=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
            if(arr[i]==0) {
                break;
            }
            size++;
        }

        int sum = arr[--size] + arr[--size] + arr[--size];
        System.out.printf("%d",sum);

    }
}