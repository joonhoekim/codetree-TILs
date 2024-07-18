import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int boardSize = 100*10*2+2;
    int[] area = new int[boardSize];
    int curPoint = boardSize/2;

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      String way = sc.next();

      int startPoint = 0;
      int endPoint = 0;

      if (way.equals("R")) {
        startPoint = curPoint;
        endPoint = curPoint + x;
        
        curPoint = endPoint;

      } else if (way.equals("L")) {
        startPoint = curPoint - x;
        endPoint = curPoint;
        
        curPoint = startPoint;
      }


      for (int j = startPoint; j < endPoint; j++) {
        area[j]++;
      }

    }
    int visitedArea = 0;

    for (int i = 0; i < area.length; i++) {
      if (area[i] > 1) {
        visitedArea++;
      }
    }

    System.out.println(visitedArea);
  }
}