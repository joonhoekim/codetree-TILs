import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int i = 0; //cursor
        while(i<str.length()){
            char target = str.charAt(i);
            int count = 0;

            while(i<str.length() && target==str.charAt(i)){
                count++;
                i++;
            }

            
            sb.append(target).append(count);
        }

        System.out.println(sb.length());
        System.out.println(sb);
    }
}