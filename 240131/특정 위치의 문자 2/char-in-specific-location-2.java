import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
            if(i==1 || i==4 || i==7) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}