import java.util.*;

public class Main {

    static int hourToMin(int h) {
        return h*=60;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int t1 = hourToMin(h1) + m1;

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int t2 = hourToMin(h2) + m2;

        System.out.print(t2-t1);


    }
}