import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int check = 1;
        for(int i = 1; i<arr.length; i++) {
            if(arr[0]>arr[i]) {
                check = 0;
            }
        }
        System.out.print(check+" ");

        check = 1;
        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                check = 0;
            }
        }
        System.out.print(check+" ");

    }
}