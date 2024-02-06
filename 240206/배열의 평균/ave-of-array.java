import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 2;
    int m = 4;
    int[][] arr2d = new int[n][m];
    //char[][] arr2d = new char[n][m];

    for(int i = 0; i<n; i++) {
      for(int j=0; j<m; j++) {
        arr2d[i][j] = sc.nextInt();
      }
    }

    //horizontal
    for(int i = 0; i<n; i++) {
        int sum = 0;
        float avg = 0;    
      for(int j=0; j<m; j++) {
            sum+=arr2d[i][j];
      }
      avg = (float)sum /m;
      System.out.printf("%.1f ",avg);
    }
    System.out.print("\n");

    //vertical
    for(int i = 0; i<m; i++) {
        int sum = 0;
        float avg = 0;    
      for(int j=0; j<n; j++) {
            sum+=arr2d[j][i];
      }
      avg = (float)sum /n;
      System.out.printf("%.1f ",avg);
    }
    System.out.print("\n");

    //all
    int sum = 0;
    float avg = 0;    
    for(int i = 0; i<n; i++) {
      for(int j=0; j<m; j++) {
            sum+=arr2d[i][j];
      }
    }
    avg = (float)sum /(n*m);
    System.out.printf("%.1f ",avg);
  }
}