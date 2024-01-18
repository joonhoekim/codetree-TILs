import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    if (b>a) {
        while(a<=b){
        System.out.print(b--+" ");
        }
    } else {
        int temp = a;
        a = b;
        b = temp;
        while(a<=b){
        System.out.print(b--+" ");
        }
    }
    
  }
}