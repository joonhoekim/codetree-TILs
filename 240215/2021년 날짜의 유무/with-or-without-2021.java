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
        if(12<M) {
            return false;
        }
        if(31<D) {
            return false;
        }

        if(M==2) {
            if(1<=D && D<=28) {
                return true;
            } else {
                return false;
            }
        } else if(M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12) {
            if(1<=D && D<=31) { //문제조건상1이상은 보장되므로 사실 안해도 됨.
                return true;
            } else {
                return false;
            }

        } else {
            if(1<=D && D<=30) { //문제조건상1이상은 보장되므로 사실 안해도 됨.
                return true;
            } else {
                return false;
            }
        }
    }
}