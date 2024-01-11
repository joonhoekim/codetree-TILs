import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char aColdSymp = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bColdSymp = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cColdSymp = sc.next().charAt(0);
        int cTemp = sc.nextInt();

        if( (aTemp < 37 && bTemp < 37) || (aTemp < 37 && cTemp < 37) || (bTemp < 37 && cTemp < 37) ) {
            System.out.println("N");
        } else if ( (aColdSymp=='N' && bColdSymp=='N') || (aColdSymp=='N' && cColdSymp=='N') || (bColdSymp=='N' && cColdSymp=='N')) {
            System.out.println("N");
        } else {
            System.out.println("E");
        }
    }
}