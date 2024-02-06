import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int m = 3;
    //int[][] arr2d = new int[n][m];
    char[][] arr2d = new char[n][m];

    for(int i = 0; i<n; i++) {
      //int sum=0;
      for(int j=0; j<m; j++) {
        arr2d[i][j] = (char) (sc.next().charAt(0)-'a'+'A');
        //계산시 int로 implicit casting 됨
        //이렇게 안하고 Character.toUpperCase() 써도 됨.
      }
      //System.out.println(sum);
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr2d[i][j]+" ");
      }
      System.out.println("");
    }

  }
}