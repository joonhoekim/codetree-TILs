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
        }

        if(y%100!=0){
            return true;
        }

        if(y%400==0) {
            return true;
        } 

        return false;
    }
}