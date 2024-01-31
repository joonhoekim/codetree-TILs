import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //이 문제는 배열 안 써도 될 것 같은데..

        int[] arr = new int[10];
        int size = 0;
        int sum = 0;

        for(int i=0; i<10; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>=250) {
                break;
            } else {
                sum+=arr[i];
                size++;
            }
        }
        double avg = (double) sum / size; // 나누기, 곱하기보다 explicit casting이 우선순위 높다.
        System.out.printf("%d %.1f",sum,avg);
    }
}