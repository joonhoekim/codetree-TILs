import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    selectionSort(arr);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void selectionSort(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      int minIdx = i;
      for(int j = i; j < arr.length; j++) {
        if(arr[minIdx] > arr[j]) {
          minIdx = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIdx];
      arr[minIdx] = temp;
    }
  }

}