import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;


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
        //Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        //Arrays.sort(arr2, Collections.reverseOrder());
        
        //콜바이레퍼런스니까 다시 정렬할 필요 없음
        //Arrays.sort(arr);
        //그냥 오름차순 정렬하고 거꾸로 출력하는게 낫겠다....
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-i-1]+" ");
        }
    }
    
}