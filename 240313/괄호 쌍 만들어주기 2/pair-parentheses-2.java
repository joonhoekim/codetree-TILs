import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        int count = 0;
        for(int i=0;i<inputString.length()-2;i++) {
            if(inputString.substring(i,i+2).equals( "((" )) {
                for(int j=i+2;j<inputString.length()-1;j++) {
                    if(inputString.substring(j,j+2).equals( "))" )) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}