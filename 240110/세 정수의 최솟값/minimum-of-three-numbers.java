import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min=arr[0];
        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i+1]<min) {
                min = arr[i+1];
            }
        }
        System.out.print(min);

    }
}