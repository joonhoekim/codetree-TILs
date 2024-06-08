import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arrCloned = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
      arrCloned[i] = arr[i];
    }
    
    Arrays.sort(arrCloned);
    int min = arrCloned[0];
    int max = arrCloned[n-1];
    
    int globalSatisfiedCount = 0;
    for(int k=min+1; k<max; k++) {
      int localSatisfiedCount = 0;
      for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
          if(Math.abs(arr[i]-k) == Math.abs(arr[j]-k)) {
            localSatisfiedCount++;
          }
        }
      }
      if(localSatisfiedCount > globalSatisfiedCount) {
        globalSatisfiedCount = localSatisfiedCount;
      }
    }
    System.out.println(globalSatisfiedCount);
  }
}