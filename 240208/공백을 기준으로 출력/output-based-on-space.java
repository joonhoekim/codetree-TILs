import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char target = ' ';

        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != target) {
                System.out.print(str.charAt(i));
            }
        }

        str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != target) {
                System.out.print(str.charAt(i));
            }
        }


        
    }
}