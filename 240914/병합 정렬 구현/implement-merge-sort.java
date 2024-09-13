import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static int[] merged_arr = {};

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");

    int[] arr = new int[input.length];
    merged_arr = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    mergeSort(arr, 0, arr.length - 1);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]).append(" ");
    }
    bw.write(sb.toString().trim());

    br.close();
    bw.flush();
    bw.close();

  }

  static void mergeSort(int[] arr, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  static void merge(int[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = low;

    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) {
        merged_arr[k] = arr[i];
        i += 1;
        k += 1;
      } else {
        merged_arr[k] = arr[j];
        j += 1;
        k += 1;
      }
    }

    while (i <= mid) {
      merged_arr[k] = arr[i];
      i += 1;
      k += 1;
    }

    while (j <= high) {
      merged_arr[k] = arr[j];
      j += 1;
      k += 1;
    }

    for (k = low; k <= high; k++) {
      arr[k] = merged_arr[k];
    }

  }

}