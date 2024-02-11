import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ee = "ee";
        String eb = "eb";
        int eeCount = 0;
        int ebCount = 0;

        for(int i=0; i<str.length()-ee.length()+1; i++ ){
            if(str.substring(i,i+ee.length()).equals(ee)) {
                eeCount ++;
            }

            if(str.substring(i,i+eb.length()).equals(eb)) {
                ebCount ++;
            }
        }

        System.out.print(eeCount+" "+ebCount);
    }
}