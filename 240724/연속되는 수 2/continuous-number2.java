import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }


    int count = 0;
    ArrayList<Integer> list = new ArrayList<>();

    if (N < 2) {
      System.out.println(1);
    } else {

      for (int i = 0; i < arr.length; i++) {
        if (i == 0 || arr[i] != arr[i-1]) {
          list.add(count);
          count = 1;
        } else {
          ++count;
        }
      }
      list.add(count);
      
      System.out.println(list.stream().mapToInt(v -> v).max().getAsInt());
    }




  }
}