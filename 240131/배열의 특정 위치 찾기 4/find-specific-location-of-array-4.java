import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int[] arr = new int[max];
        int sumOfEven=0;
        int countOfEven=0;

        for(int i=0;i<max;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0) {
                break;
            }

            if(arr[i]%2==0){
                sumOfEven+=arr[i];
                countOfEven++;
            }
        }
        

        System.out.printf("%d %d",countOfEven,sumOfEven);
    }
}