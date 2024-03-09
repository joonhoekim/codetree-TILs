import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int selected=0; selected<arr.length; selected++) {
            int sum = 0;
            for(int compared=0; compared<arr.length; compared++) {
                int distance = Math.abs(compared - selected);
                sum += distance * arr[compared];
            }
            min = Math.min(min, sum);
        }

        System.out.print(min);
    }
}