import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        takeTurn(arr.clone());
    }

    static void takeTurn(int[] arr) {
        //짝수 원소만 2로 나눠서 출력
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]/2 + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}