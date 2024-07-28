import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    List<Integer> A_positions = new ArrayList<>();
    List<Integer> B_positions = new ArrayList<>();

    move(A_positions, N, sc);
    move(B_positions, M, sc);

    int sec = -1;

    int minLength = Math.min(A_positions.size(), B_positions.size());

    for (int i = 0; i < minLength; i++) {
      if (A_positions.get(i).equals(B_positions.get(i))) {
        sec = i + 1;
        break;
      }
    }

    System.out.println(sec);
  }

  public static void move(List<Integer> positions, int moves, Scanner sc) {
    int position = 0;

    for (int i = 0; i < moves; i++) {
      char direction = sc.next().charAt(0);
      int time = sc.nextInt();

      for (int t = 0; t < time; t++) {
        if (direction == 'R') {
          position += 1;
        } else if (direction == 'L') {
          position -= 1;
        }
        positions.add(position);
      }
    }
  }
}