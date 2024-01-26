import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = true;
        for(int i=0;i<5;i++){
            if((sc.nextInt())%3!=0){
                satisfied=false;
            }
        }
        if(satisfied) System.out.print("1");
        else System.out.print("0");
    }
}