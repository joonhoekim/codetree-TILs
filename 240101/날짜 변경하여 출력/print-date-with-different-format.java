import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        System.out.printf("%d-%d-%d",mm,dd,yyyy);
    }
}