import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(valMD(M,D)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    static boolean valMD(int M,int D){
        int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(maxDays[M-1]<D) {
            return false;
        } else {
            return true;
        }
    }
}