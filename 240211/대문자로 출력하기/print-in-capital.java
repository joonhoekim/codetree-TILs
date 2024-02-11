import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char[] strToChar= str.toCharArray();
        char[] arrAns= new char[len];
        int size = 0;
        for(int i=0;i<len;i++){
            char target = strToChar[i];
            if('A' <= target && target <= 'Z') {
                arrAns[size++] = target;
            } else if('a' <= target && target <= 'z'){
                target = (char)((int) target - 32); //65=0x41=A, 97=0x61=a, a-A = 97-65 = 32
                arrAns[size++] = target;
            } else {
                continue;
            }
        }

        //System.out.print(String.valueOf(arrAns));

        for(int i=0;i<size;i++){
            System.out.print(arrAns[i]);
        }


    }
}