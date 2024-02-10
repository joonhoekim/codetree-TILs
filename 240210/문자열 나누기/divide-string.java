import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = "";
        for(int i=0;i<n;i++){
            str+=sc.next();
        }
        for(int i=0;i<=str.length()/5;i++){
            for(int j=0;j<5;j++){
                int targetIdx=5*i+j;
                if(targetIdx==str.length()){
                    break;
                }
                System.out.print(str.charAt(targetIdx));
            }
            System.out.println("");
        }
    }
}