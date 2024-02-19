import java.util.Scanner;

public class Main {

    static final int SIZE = 100+1;
    static int[] arr = new int[SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int sum = 0;
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            for(int j=a1; j<=a2; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}