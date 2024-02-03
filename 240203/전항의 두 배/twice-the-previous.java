import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ppp = sc.nextInt();
        int pp = sc.nextInt();
        int p;
        System.out.print(ppp+" "+pp+" ");
        for(int i=0;i<8;i++){
            p=pp+2*ppp;
            System.out.print(p+" ");
            ppp=pp;
            pp=p;

        }
    }
}