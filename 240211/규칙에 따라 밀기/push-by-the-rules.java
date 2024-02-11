import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();

        String command = sc.nextLine();

        for(int i=0;i<command.length();i++){
            char type = command.charAt(i);
            if(type == 'L'){
                str = str.substring(1) + str.substring(0,1);
            } else if(type == 'R') {
                str = str.substring(len-1)+ str.substring(0,len-1); 
            }
            // } else if(type==3){
            //     char[] cArr = new char[len];
            //     for(int j=0; j<len; j++) {
            //         cArr[len-1-j] = str.charAt(j);
            //     }
            //     str = String.valueOf(cArr);
            // }

            // System.out.println(str);
        }
            System.out.println(str);

    }
}