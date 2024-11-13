import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Character> list = new LinkedList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();

    char[] arr = sc.next().toCharArray();

    for (int i = 0; i < n; i++) {
      list.add(arr[i]);
    }

    ListIterator<Character> it = list.listIterator();


    while (it.hasNext()) {
      it.next();
    }

    for (int i = 0; i <= m; i++) {
      String command = sc.nextLine();

      if (command.startsWith("L")) {
        it.previous();
      } else if (command.startsWith("R")) {
        it.next();
      } else if (command.startsWith("D")) {
        it.next();
        it.remove();
      } else if (command.startsWith("P")) {
        char x = (command.charAt(command.length()-1));
        it.add(x);
      }
    }

    for (char x : list) {
      System.out.print(x);
    }



  }
}