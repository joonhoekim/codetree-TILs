import java.util.Scanner;

public class Main {
  public static String[] arr = new String[2];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    arr[0] = sc.nextLine();
    arr[1] = sc.nextLine();

    System.out.println(isContain());

    sc.close();
  }

  public static int isContain() {
    if (arr[0].contains(arr[1])) {
      return arr[0].indexOf(arr[1]);
    }
    return -1;
  }
}