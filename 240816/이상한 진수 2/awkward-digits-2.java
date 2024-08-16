import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] arr = sc.next().toCharArray();

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] == '1' ? '0' : '1';

      int value = getDecimal(arr);

      if (max < value) {
        max = value;
      }

      arr[i] = arr[i] == '1' ? '0' : '1';
    }

    System.out.println(max);
  }


  public static int getDecimal(char[] arr) {
    int result = 0;
    int degree = 1;
    for (int i = arr.length-1; i >= 0; i--) {
      if (arr[i] == '1') {
        result += degree;
      }
      degree *= 2;
    }

    return result;
  }
}