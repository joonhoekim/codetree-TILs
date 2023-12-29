import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==1){
            a+=3;
        }
        if(a%3==0) {
            a/=3;
        }
        System.out.print(a);
    }
}