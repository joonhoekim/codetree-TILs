import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] area = new int[2000];
    int curPoint = 1000;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      String way = sc.next();


      if (way.equals("R")) {
        for (int j = curPoint; j <= curPoint + x; j++) {
          area[j]++;
        }
        curPoint += x;
      } else if (way.equals("L")) {
        for (int j = curPoint; j >= curPoint-x; j--) {
          area[j]++;
        }
        curPoint -= x;
      }
    }
    int visitedArea = 0;

    for (int i = 0; i < area.length; i++) {
      if (area[i] > 1 && area[i+1] > 1) {
        visitedArea++;
      }
    }

    System.out.println(visitedArea);
  }
}