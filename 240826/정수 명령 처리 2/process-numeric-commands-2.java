import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      String input = sc.nextLine();
      if (input.startsWith("push")) {
        int value = Integer.parseInt(input.split(" ")[1]);
        queue.add(value);
      } else if (input.startsWith("pop")) {
        System.out.println(queue.poll());
      } else if (input.startsWith("size")) {
        System.out.println(queue.size());
      } else if (input.startsWith("empty")) {
        if (queue.isEmpty()) {
          System.out.println(1);
        } else {
          System.out.println(0);
        }
      } else if (input.startsWith("front")) {
        System.out.println(queue.peek());
      }
    }
  }
}