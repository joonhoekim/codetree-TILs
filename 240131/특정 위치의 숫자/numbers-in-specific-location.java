import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; //sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = arr[2] + arr[4] + arr[9];
        System.out.print(sum);

    }
}