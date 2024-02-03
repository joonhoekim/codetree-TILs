import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int pp = sc.nextInt();//5
        int ppp=1;

        System.out.print(ppp+" "+pp+" ");
        for(;;) {
            p = pp + ppp;//6-11
            System.out.print(p+" ");

            if (p > 100) {
                break;
            }
            ppp=pp;//5
            pp=p;//6
        }

    }
}