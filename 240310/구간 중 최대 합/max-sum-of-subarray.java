import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0;i<arr.length-k;i++) {
            int sum = 0;
            for(int j=i;j<i+k;j++) {
                sum+=arr[j];
            }
            max = Math.max(sum, max);
        }

        System.out.print(max);
    }
}