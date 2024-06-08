import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if(c%a==0 || c%b==0) {
      System.out.println(c);
      return;
    }

    int globalMax = 0;
    for(int aTimes=a; true; aTimes+=a) {
      if(aTimes >= c) break;
      int aMinusC = c - aTimes;
      int remainder = aMinusC % b;
      if(remainder==0) {
        System.out.println(c);
        return;
      } else {
        globalMax = Math.max(globalMax, c-remainder);
      }
    }

    System.out.println(globalMax);

  }

}