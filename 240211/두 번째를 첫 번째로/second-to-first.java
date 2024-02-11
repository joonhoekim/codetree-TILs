import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = sc.nextLine().toCharArray();
        char second = cArr[1];
        for(int i=0; i<cArr.length; i++){
            if(cArr[i]==second){
                cArr[i]=cArr[0];
            }
        }

        System.out.print(String.valueOf(cArr));
    }
}