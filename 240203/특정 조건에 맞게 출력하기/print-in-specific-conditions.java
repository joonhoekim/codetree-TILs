import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size;
        for(int i=0;;i++) {
            int input = sc.nextInt();
            if(input==0){
                size = i;
                break;
            }
            if (input%2==0) {
                input = input/2;
            } else {
                input = input+3;
            }
            arr[i] = input;

        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}