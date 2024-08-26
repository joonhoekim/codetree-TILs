import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  /*
   * Josephus 이야기
   * 원형으로 둘러앉고 N 번째사람을 제거
   *
   * */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    //사람 번호를 큐에 넣는다.
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      queue.add(i);
    }

    while (queue.size() > 0) {
      //K번째 사람을 찾기 위해 큐를 순환시키고, 제거한다.
      int dead = 0;
      for (int i = 0; i < k - 1; i++) {
        queue.add(queue.poll());
      }
      int removed = queue.poll();
      System.out.print(removed + " ");
      //이것을 모두 제거하기까지 반복한다.
    }


  }
}