import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int answer = 0;

    for (int i = X; i <= Y; i++) {
      List<Integer> list = splitNum(i);

      boolean isSame = true;
      for (int j = 0; j <= list.size()/2; j++) {
        int a = list.get(j);
        int b = list.get(list.size()-j-1);

        if (a != b) {
          isSame = false;
          break;
        }
      }

      if (isSame) {
        answer++;
      }
    }

    System.out.println(answer);
  }

  public static List<Integer> splitNum(int i) {
    ArrayList<Integer> list = new ArrayList<>();

    while (i >= 10) {
      list.add(i % 10);
      i = i/10;
    }
    list.add(i);


    return list;
  }
}