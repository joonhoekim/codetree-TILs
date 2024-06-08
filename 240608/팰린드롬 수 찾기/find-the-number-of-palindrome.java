import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();

    int count = 0;
    for (int tested = start; tested <= end; tested++) {
      int localCount = 0;
      char[] input = String.valueOf(tested).toCharArray();
      boolean isSatisfied = true;
      for (int i = 0; i < input.length/2; i++) {
        if(input[i] != input[input.length-1-i]) {
          isSatisfied = false;
          break;
        }
      }

      if(isSatisfied) count++;

    }
    System.out.println(count);
  }
}