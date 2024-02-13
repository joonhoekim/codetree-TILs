import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(isLeap(y)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    static boolean isLeap(int y) {
        if(y%4!=0) {
            return false;
        } else if(y%4==0 && y%100==0 && y%400!=0) {
            return false;
        } 

        return true;
    }
}