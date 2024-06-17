import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    String T = sc.next();



    List<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String word = sc.next();

      if (word.startsWith(T)) {
        list.add(word);
      }
    }

    list.sort(String::compareTo);

    System.out.println(list.get(k-1));

    sc.close();
  }
}