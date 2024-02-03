import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrCount = new int[10];
        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            arrCount[input]++;            
        }
        for(int i=1;i<10;i++){
            System.out.println(arrCount[i]);
        }
    }
}