import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        asc(arr);
        System.out.println();
        desc(arr);
    }
    static void asc(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void desc(int[] arr) {
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}