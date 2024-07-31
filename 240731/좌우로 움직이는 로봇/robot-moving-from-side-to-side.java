import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();

    int timeA = move(sc, n, A);
    int timeB = move(sc, m, B);

    int maxLength = n > m ? timeA : timeB;
    int count = 0;

    for (int i = 2; i < maxLength; i++) {
      int aCurPosition = i >= timeA ? A.get(timeA-1) : A.get(i);
      int bCurPosition = i >= timeB ? B.get(timeB-1) : B.get(i);
      int aBefPosition = i > timeA ? A.get(timeA-1) : A.get(i-1);
      int bBefPosition = i > timeB ? B.get(timeB-1) : B.get(i-1);

      if (aBefPosition != bBefPosition) {
        if (aCurPosition == bCurPosition) {
          count++;
        }
      }
    }

    System.out.println(count);
  }
  public static int move(Scanner sc, int n, ArrayList<Integer> list) {
    int distance = 0;

    for (int i = 0; i < n; i++) {
      int t = sc.nextInt();
      char d = sc.next().charAt(0);


      for (int j = 0; j < t; j++) {
        if (d == 'R') {
          distance += 1;
          list.add(distance);
        } else if (d == 'L') {
          distance -= 1;
          list.add(distance);
        }
      }
    }
    return list.size();
  }
}