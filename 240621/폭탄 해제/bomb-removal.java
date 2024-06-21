import java.util.Scanner;

class Bomb {
  String defuseCode;
  char lineColor;
  int remainSecond;

  public Bomb(String defuseCode, char lineColor, int remainSecond) {
    this.defuseCode = defuseCode;
    this.lineColor = lineColor;
    this.remainSecond = remainSecond;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String code = sc.next();
    char color = sc.next().charAt(0);
    int second = sc.nextInt();

    Bomb bomb = new Bomb(code, color, second);

    System.out.println("code : " + bomb.defuseCode);
    System.out.println("color : " + bomb.lineColor);
    System.out.println("second : " + bomb.remainSecond);

    sc.close();
  }
}