import java.util.Scanner;

class Spy {
  String secretCode;
  char meetingPoint;
  int time;

  public Spy(String secretCode, char meetingPoint, int time) {
    this.secretCode = secretCode;
    this.meetingPoint = meetingPoint;
    this.time = time;
  }
}


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String secretCode = sc.next();
    char meetingPlace = sc.next().charAt(0);
    int time = sc.nextInt();

    Spy sp = new Spy(secretCode, meetingPlace, time);

    System.out.printf("secret code : %s\n", sp.secretCode);
    System.out.printf("meeting point : %c\n", sp.meetingPoint);
    System.out.printf("time : %d\n", sp.time);
    }
}