import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String t1 = str1+str2;
        String t2 = str2+str1;

        // if(t1.equals(t2)){
        //     System.out.print("true");
        // } else{
        //     System.out.print("false");
        // }

        boolean b = false;
        for(int i=0;i<t1.length();i++){
            if(t1.charAt(i)==t2.charAt(i)){
                b=true;
            }
        }

        if(b){
            System.out.print("true");
        } else{
            System.out.print("false");
        }
    }
}