import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        if(str.length()<=n){
            n=str.length();
        }
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(str.length()-1-i));
        }
    }
}