import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    asc(N);
    System.out.println();
    desc(N);
    sc.close();
  }

  public static void asc(int n) {
    if (n == 0)
      return;

    asc(n-1);
    System.out.print(n + " ");
  }

  public static void desc(int n) {
    if (n == 0)
      return;
    
    System.out.print(n + " ");
    desc(n-1);

  }
}