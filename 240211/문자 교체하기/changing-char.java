import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] cArr1 = str2.toCharArray();
        cArr1[0]=str1.charAt(0);
        cArr1[1]=str1.charAt(1);

        System.out.print(cArr1);
    }
}