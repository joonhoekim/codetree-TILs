import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //이 문제는 백준에서 초창기에 풀었던 윤년 문제네
        int y = sc.nextInt();
        if( (y%4==0) && (!(y%100==0) || (y%400==0) ) ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}