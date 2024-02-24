import java.util.*;

public class Main {

    static String baseConversion(int base10, int base) {
        //from base10
        //진법 변환은 a진법에서 b진법으로 바로 가기보다 10진법 경유?
        StringBuilder sb = new StringBuilder();

        if(base10 == 0) {
            return "0";
        }
        while(true) {
            if(base10 == 1) {
                sb.append(1);
                return sb.reverse().toString();
            } else if (base10 == 0) {
                return sb.reverse().toString();
            }

            sb.append(base10%base);
            base10 = base10/base;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        String converted = baseConversion(n,b);
        System.out.println(converted);
    }
}