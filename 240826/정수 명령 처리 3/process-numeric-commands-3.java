import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  /*
   * push_front A: 정수 A를 덱의 앞에 넣습니다.
   * push_back A: 정수 A를 덱의 뒤에 넣습니다.
   * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력합니다.
   * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력합니다.
   * size: 덱에 들어있는 정수의 개수를 출력합니다.
   * empty: 덱이 비어있으면 1을, 아니면 0을 출력합니다.
   * front: 덱의 가장 앞에 있는 정수를 출력합니다.
   * back: 덱의 가장 뒤에 있는 정수를 출력합니다.
   * */

  public static void main(String[] args) throws IOException {
    Deque<Integer> deque = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String input = br.readLine();
      if (input.startsWith("push_front")) {
        int value = Integer.parseInt(input.split(" ")[1]);
        deque.addFirst(value);
      } else if (input.startsWith("push_back")) {
        int value = Integer.parseInt(input.split(" ")[1]);
        deque.addLast(value);
      } else if (input.startsWith("pop_front")) {
        System.out.println(deque.pollFirst());
      } else if (input.startsWith("pop_back")) {
        System.out.println(deque.pollLast());
      } else if (input.startsWith("size")) {
        System.out.println(deque.size());
      } else if (input.startsWith("empty")) {
        if (deque.isEmpty()) {
          System.out.println(1);
        } else {
          System.out.println(0);
        }
      } else if (input.startsWith("front")) {
        System.out.println(deque.peekFirst());
      } else if (input.startsWith("back")) {
        System.out.println(deque.peekLast());
      }
    }
  }
}