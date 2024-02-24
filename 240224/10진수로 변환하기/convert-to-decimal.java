import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();

        int base10 = 0;
        for(int i=0; i<bin.length(); i++) {
            base10 = base10*2 + (bin.charAt(i)-'0');
        }

        System.out.println(base10);
    }
}