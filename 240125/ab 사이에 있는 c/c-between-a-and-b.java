import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        boolean condi = false;
        for(int i=a; i<=b; i++){
            if(i%c==0) {
                condi=true;
                break;
            }
        }

        if(condi) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        
    }
}