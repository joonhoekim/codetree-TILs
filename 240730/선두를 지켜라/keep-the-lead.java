import java.util.ArrayList;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();

    int count = 0;

    move(sc, N, A);
    move(sc, M, B);

    boolean[] changes = new boolean[A.size()];

    for (int i = 1; i < A.size(); i++) {
      if (A.get(i) > B.get(i)) {
        changes[i] = true;
      } else if (A.get(i) == B.get(i)) {
        changes[i] = changes[i-1];
      } else {
        changes[i] = false;
      }
    }

    for (int i = 1; i < changes.length; i++) {
      if (changes[i-1] != changes[i]) {
        count++;
      }
    }
    System.out.println(count);
  }
  public static void move(Scanner sc, int n, ArrayList<Integer> list) {
    for (int i = 0; i < n; i++) {
      int v = sc.nextInt();
      int t = sc.nextInt();
      int distance = 0;

      for (int j = 0; j < t; j++) {
        list.add(distance + v);
      }
    }
  }

}