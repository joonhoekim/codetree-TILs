import java.util.Scanner;

  public class Main {
    public static int[][] rank = new int[10][20];

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int K = sc.nextInt();
      int N = sc.nextInt();

      for (int i = 0; i < K; i++) {
        for (int j = 0; j < N; j++) {
          int developer = sc.nextInt()-1;  
          rank[i][developer] = j;
        }
      }

      int count = 0;
      for (int a = 0; a < N; a++) {
        for (int b = 0; b < N; b++) {
          boolean isHigher = true;
          for (int k = 0; k < K; k++) {
            if (a == b || rank[k][a] > rank[k][b]) {
              isHigher = false;
              break;
            }
            
          }
          if (isHigher) {
            count++;
          }
        }
      }

      System.out.println(count);
    }
  }