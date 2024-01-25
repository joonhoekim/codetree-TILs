import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int answer = 1;
        if(b==0){
            System.out.print("1");
            return;
        }
        for(int i=0; i<b; i++) {
            answer*=a; 
        }
        System.out.printf("%d",answer);
        
    }
}