import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b =sc.nextInt();
        boolean satisfied = false;
        //a<=b 라는 조건이 있으므로 비교없이 바로
        for(int i=2; i<=a; i++) {
            if (a%i==0 && b%i==0) {
                satisfied=true;
                break;
            }
        }


        if(satisfied) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        
    }
}