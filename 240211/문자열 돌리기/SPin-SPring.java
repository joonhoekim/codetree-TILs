import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();
        for (int i=0;i<=len;i++){
            System.out.println(str);
            str = str.substring(len-1) + str.substring(0,len-1);
        }
    }
}