import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.print(sb);
        sc.close();
    }
}