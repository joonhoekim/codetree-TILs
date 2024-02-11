import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = (char) ( (int)sc.next().charAt(0) + 1 );
        if(a - 1 == 'z') {
            a = 'a';
        }
        //int b = (int) sc.next().charAt(0);
        System.out.printf("%c",a);

    }
}