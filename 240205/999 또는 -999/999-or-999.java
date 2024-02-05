import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 최대 100개 조건이 문제 조건
        Scanner sc = new Scanner(System.in);
        int n = 100; // 하드코딩하면 나중에 다 바꿔야 함.
        int[] arr = new int[n];
        int size=0;
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]== 999 || arr[i]==-999) {
                size = i;
                break;
            }
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<size; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.print(max+" "+min);
    }
}