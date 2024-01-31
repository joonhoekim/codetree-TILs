import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sumOfEven=0;
        for(int i=1; i<n; i+=2){
            sumOfEven+=arr[i];
        }

        int sumOfThree=0;
        int countOfThree=0;

        for(int i=2; i<n; i+=3) {
            sumOfThree += arr[i];
            countOfThree++;
        }
        double avgOfThree = (double) sumOfThree/countOfThree;


        System.out.printf("%d %.1f",sumOfEven,avgOfThree);

    }
}