import java.util.*;

public class Main {

    public static int toDecimal(String input, int base) {
        int len = input.length();
        int[] arr = new int[len];
        int num = 0;
        for(int i=0; i<len; i++) {
            num = num*base + input.charAt(i) - '0';
        }
        return num;
    }

    public static String convertBase(int base10, int base) {
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            if(base10<base) {
                if(base10==0) {
                    return sb.reverse().toString();
                }
                sb.append(base10);
                return sb.reverse().toString();
            }
            sb.append(base10 % base);
            base10/=base;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base2 = sc.next();
        int decimal = toDecimal(base2, 2) * 17;
        System.out.print(convertBase(decimal,2));
    }
}