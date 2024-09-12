import java.util.Scanner;

  public class Main {
    public static int[] box = new int[100];

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int K = sc.nextInt();

      for (int i = 0; i < N; i++) {
        box[i] = sc.nextInt();
      }

      int bombNo = -1;

      for (int i = 0; i < N; i++) {
        for (int j = i+1; j <= i+K; j++) {
          if (box[i] == box[j]) {
            bombNo = box[j];
          }
        }
      }

      System.out.println(bombNo);
    }
  }