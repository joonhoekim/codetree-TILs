import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        int targetIdx1 = 1;
        int targetIdx2 = str.length()-2;
        String str1 = str.substring(0,targetIdx1);
        String str2 = str.substring(targetIdx1+1,targetIdx2);
        String str3 = str.substring(targetIdx2+1,str.length());

        System.out.print(str1+str2+str3);

    }
}