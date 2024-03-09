import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int cursor = 0; cursor<str.length(); cursor++) {
            if(str.charAt(cursor) == ')' ) {
                continue;
            } else if ( str.charAt(cursor) == '(' ) {
                for( int checked = cursor+1; checked < str.length(); checked++ ) {
                    if(str.charAt(checked) == ')' ) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}