import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(valYMD(Y,M,D)){
            System.out.print(season(M));
        } else {
            System.out.print(-1);
        }
    }

    static String season(int M) {
        if(3<=M && M<=5) {
            return "Spring";
        } else if(6<=M && M<=8) {
            return "Summer";
        } else if(9<=M && M<=11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    static boolean isReap(int Y) {
        if(Y%4!=0) return false;
        if(Y%400==0) return true;
        if(Y%100==0) return false;
        return true;
    }

    static boolean valYMD(int Y, int M, int D) {
        return valMD(M,D,isReap(Y));
    }

    static boolean valMD(int M,int D, boolean reap){
        if(M>12) {
            return false;
        }
        int[] maxDays;
        int[] reapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] nonReapYear = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(reap==false) {
            maxDays = nonReapYear;
        } else {
            maxDays = reapYear;
        }
        
        
        if(maxDays[M-1]<D) {
            return false;
        } else {
            return true;
        }
    }
}