import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size=0;
        int[] arrEven = new int[n];
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input%2==0){
                arrEven[size++]=input;
            }
        }

        for(int i=0; i<size; i++){
            System.out.print(arrEven[size-i-1]+" ");
        }

    }
}