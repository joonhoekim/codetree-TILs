import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = "";
        for(int i=0;i<n;i++){
            str+=sc.next();
        }
        
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if((i+1)%5==0) {
                System.out.println("");
            }
        }

    }
}