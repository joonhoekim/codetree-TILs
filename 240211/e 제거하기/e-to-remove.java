import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = str.indexOf("e");
        str = str.substring(0,idx) + str.substring(idx+"e".length(),str.length());
        System.out.print(str);
    }
}