import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), n = sc.nextInt();
    int count = 0;
    while(count<n){
        System.out.println(a+=n);
        count++;
    }
  }
}