import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String zzz = sc.next();
        String xxxx = sc.next();
        String yyyy = sc.next();
        System.out.printf("%s-%s-%s",zzz,yyyy,xxxx);
    }
}