import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();

    move(sc, N, A);
    move(sc, M, B);

    int leader = 0;
    int count = 0;

    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) > B.get(i)) {
        if (leader == 2) {
          count++;
        }
        leader = 1;

      } else if (A.get(i) < B.get(i)) {
        if (leader == 1) {
          count++;
        }
        leader = 2;
      }
    }

    System.out.println(count);
  }
  public static void move(Scanner sc, int n, ArrayList<Integer> list) {
    int distance = 0;

    for (int i = 0; i < n; i++) {
      int v = sc.nextInt();
      int t = sc.nextInt();

      for (int j = 0; j < t; j++) {
        distance += v;
        list.add(distance);
      }
    }
  }
}