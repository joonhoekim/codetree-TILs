import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrCount = new int[9];
        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            arrCount[input-1]++;            
        }
        for(int i=0;i<9;i++){
            System.out.println(arrCount[i]);
        }
    }
}