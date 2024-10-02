import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static int N = 15;
  public static ArrayList<Integer> list = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    loop:
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        for (int k = j+1; k < N; k++) {
          for (int l = k+1; l < N; l++) {
            int a = list.get(i);
            int b = list.get(j);
            int c = list.get(k);
            int d = list.get(l);
            if(isContain(a, b, c, d)) {
              System.out.printf("%d %d %d %d\n",a, b, c, d);
              break loop;
            }
          }
        }
      }
    }
  }

  public static boolean isContain(int A, int B, int C, int D) {
    if (list.contains(A+B) &&
        list.contains(B+C) &&
        list.contains(C+D) &&
        list.contains(D+A) &&
        list.contains(A+C) &&
        list.contains(B+D) &&
        list.contains(A+B+C) &&
        list.contains(A+B+D) &&
        list.contains(A+C+D) &&
        list.contains(B+C+D) &&
        list.contains(A+B+C+D)) {
      return true;
    } else {
      return false;
    }
  }
}