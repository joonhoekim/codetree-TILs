import java.util.Scanner;

public class Main {

  public static int MAX_N = 4;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    if (isIntersecting()) {
      System.out.println("intersecting");
    } else {
      System.out.println("nonintersecting");
    }
  }

  public static boolean isIntersecting() {
    for (int i = 0; i < arr.length; i++) {
      if (i < 2) {
        for (int j = arr[2]; j < arr[3]; j++) {
          if (arr[i] == j) {
            return true;
          }
        }
      } else {
        for (int j = arr[0]; j < arr[1]; j++) {
          if (arr[i] == j) {
            return true;
          }
        }
      }
    }
    return false;
  }
}