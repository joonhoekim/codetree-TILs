import java.util.Scanner;

class DefuseCode {
    String code;
    char color;
    int second;

    DefuseCode(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    
    public void printAll() {
        System.out.printf("code : %s\n",code);
        System.out.printf("color : %c\n",color);
        System.out.printf("second : %d\n",second);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();

        DefuseCode defuseCode = new DefuseCode(code,color,second);
        defuseCode.printAll();

    }
}