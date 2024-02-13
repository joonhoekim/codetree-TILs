import java.util.Scanner;

public class Main {
    static int sumDiv10(int n) {
        //수학의 영역
        
        return (1+n)*n/2/10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(sumDiv10(n));

    }
}