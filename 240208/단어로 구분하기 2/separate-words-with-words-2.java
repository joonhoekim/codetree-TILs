import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] arr = new String[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<n; i++){
            if(i%2==0)
            System.out.println(arr[i]);
        }
        
    }
}