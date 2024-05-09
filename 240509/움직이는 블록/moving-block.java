import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //넘치거나 부족한 블록을 평균값으로 맞춰주기 위해서는 최대 n회 이동이 필요할 것이다.
    //평균과 동일한 높이의 블록은 이동시키지 않아도 된다. 그것만 n회에서 빼주면 될 것 같다.

    //사전 세팅
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    //항상 동일하게 만들 수 있으므로, 목표치 먼저 구해버림
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    int avg = sum / n;

    //각 자리별로 줄어들고 늘어나야 할 것을 미리 계산
    int[] diff = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      //+이면 부족해서 필요하고, -이면 남아서 빼야 하는 것
      diff[i] = Math.abs(arr[i] - avg);
      count+=diff[i];
    }

    System.out.println(count/2);


  }
}