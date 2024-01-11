import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}