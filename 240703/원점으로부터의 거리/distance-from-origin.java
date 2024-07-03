import java.util.Arrays;
import java.util.Scanner;

class Dot implements Comparable<Dot> {
  int no;
  int x;
  int y;

  public Dot(int no, int x, int y) {
    this.no = no;
    this.x = x;
    this.y = y;
  }

  public int compareTo(Dot dot) {
    if (Math.abs(this.x) + Math.abs(this.y) == Math.abs(dot.x) + Math.abs(dot.y)) {
      return this.no - dot.no;
    }
    return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(dot.x) + Math.abs(dot.y));
  }

}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    Dot[] dots = new Dot[N];

    for (int i = 0; i < N; i++) {
      dots[i] = new Dot(i+1, sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(dots);

    for (Dot dot : dots) {
      System.out.println(dot.no);
    }
  }
}