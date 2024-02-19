import java.util.Scanner;

public class Main {


    static void recursiveArray(int a, int b) {
        if(b==0) {
            System.out.println("");
            return;
        }
        System.out.print(a + " ");
        recursiveArray(a+1, b-1);
        System.out.print(a + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveArray(1,n);
    }
}