import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();
        int idx = str.indexOf(target);

        while(idx != -1) {
            str = str.substring(0,idx) + str.substring(idx+target.length(),str.length());
            idx = str.indexOf(target);
        }
        System.out.println(str);

    }
}