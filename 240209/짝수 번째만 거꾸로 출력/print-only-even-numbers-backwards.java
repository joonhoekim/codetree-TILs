import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--) {
            if(i%2==1) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}