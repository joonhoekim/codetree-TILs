import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] stackCounter = new int[n];

        
        for(int i=0; i<k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a; j<=b; j++) {
                stackCounter[j]++;
            }
        }
        Arrays.sort(stackCounter);
        System.out.print(stackCounter[n-1]);


    }
}