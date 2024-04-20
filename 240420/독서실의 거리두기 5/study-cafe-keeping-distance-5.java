import java.util.Scanner;

//가장 띄엄띄엄 사람들이 앉게 신규 인원을 배치하기

public class Main {

  private static char empty = '0';
  private static char occupied = '1';

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String input = sc.next();
    //이 문제에서 시간을 썼던 부분 1
    StringBuffer sb = new StringBuffer();
    int maxOfMinDist = 0;
    for (int i = 0; i < n; i++) {
      sb.setLength(0);
      sb.append(input);
      if (sb.charAt(i) == empty) {
        sb.replace(i, i + 1, Character.toString(occupied));
        // System.out.println(sb);
        int localMinDist = getMinDist(sb.toString());
        maxOfMinDist = Math.max(maxOfMinDist, localMinDist);
        // System.out.println(localMinDist);
      }
    }

    System.out.println(maxOfMinDist);
  }

  private static int getMinDist(String seat) {
    int minDist = Integer.MAX_VALUE;

    int pointer1 = -1;
    int pointer2 = -1;

    for (int i = 0; i < seat.length(); i++) {
      if (seat.charAt(i) == occupied) {
        //이 문제에서 시간을 썼던 부분 2
        pointer1 = pointer2;
        pointer2 = i;
        if (pointer1 != -1) {
          minDist = Math.min(minDist, pointer2 - pointer1);
        }
      }
    }

    return minDist;

  }
}