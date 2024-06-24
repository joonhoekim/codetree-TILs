import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
      if (i % 2 == 0) {
        System.out.print(getMedian(list, list.size()) + " ");
      }
    }
  }

  public static int getMedian(List<Integer> list, int size) {
    list.sort(Integer::compareTo);
    return list.get(size/2);
  }
}