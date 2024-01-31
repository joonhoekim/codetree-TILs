import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // sc.nextInt();
        int sumOfEven=0;
        int sumOfThree=0;
        int countOfThree=0;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            if((i+1)%2==0) {
                sumOfEven+=arr[i];
            }

            if((i+1)%3==0) {
                sumOfThree += arr[i];
                countOfThree++;
            }
        }

        double avgOfThree = (double) sumOfThree/countOfThree;
        System.out.printf("%d %.1f",sumOfEven,avgOfThree);

    }
}