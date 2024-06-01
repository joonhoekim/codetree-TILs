import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    int[] arr1 = inputArr(n1, sc);
    int[] arr2 = inputArr(n2, sc);
    
    if(isContain(arr2,arr1)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  static int[] inputArr(int n, Scanner sc) {
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    return arr;
  }

  static boolean isContain(int[] A, int[] B) {
    for(int i=0; i<=B.length - A.length; i++) {
      boolean isSub = true;
      for(int j=0; j<A.length; j++) {
        if(B[i+j] != A[j]){
          isSub=false;
          break;
        }
      }
      if(isSub) return true;
    }
    return false;
  }
}