import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int k = getDigitLength(getMax(arr))+1;

    radixSort(arr, k);

    String answer = String.join(" ", Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new));
    
    System.out.println(answer);
  }

  private static int getDigitLength(int num) {
    int digit = 0;
    while (num > 0) {
      num = num / 10;
      digit++;
    }
    return digit;
  }



  private static int getMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }
    return max;
  }


  /*
  *
function radix_sort(arr, k)
  for pos = k - 1 ... pos >= 0:
    set arr_new = [10][]
    for i = 0 ... i < arr.size
      set digit = posth digit of arr[i]
      arr_new[digit].append(arr[i])

    set store_arr = []
    for i = 0 ... i < 10
      for j = 0 ... j < arr_new[i].size
        store_arr.append(arr_new[i][j])

    arr = store_arr

  return arr

  * */
  public static void radixSort(int[] arr, int k) {
    for (int pos = k - 1; pos >= 0; pos--) {
      List<List<Integer>> arrNew = new ArrayList<>(10);
      for (int i = 0; i < 10; i++) {
        arrNew.add(new ArrayList<>());
      }

      for (int num : arr) {
        int digit = getDigit(num, pos);
        arrNew.get(digit).add(num);
      }

      int index = 0;
      for (List<Integer> bucket : arrNew) {
        for (int num : bucket) {
          arr[index++] = num;
        }
      }
    }

  }

  private static int getDigit(int num, int pos) {
    return (num / (int) Math.pow(10, pos)) % 10;
  }


}