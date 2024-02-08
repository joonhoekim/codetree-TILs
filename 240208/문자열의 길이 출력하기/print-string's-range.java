import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String str = sc.next();
        sum+=str.length();
        str = sc.next();
        sum+=str.length();
        System.out.println(sum);
        
    }
}