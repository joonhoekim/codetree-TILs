import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int[] arr = new int[max];
        int size = 0;

        for(int i=0; i<max; i++) {
            int input = sc.nextInt();
            if(input==0) {
                break;
            }
            arr[i]=input;
            size++;
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[size-i-1]+" ");
        }
    }
}