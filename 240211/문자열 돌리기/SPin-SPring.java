import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //shift to right, 1
        for (int i=0;i<=str.length();i++){
            System.out.println(str);
            str = str.substring(str.length()-1) + str.substring(0,str.length()-1);
        }
    }
}