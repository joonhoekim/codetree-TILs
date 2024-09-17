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

//    int k = getDigitLength(getMax(arr));

    int[] sortedArr = radixSort(arr, 6);

    String answer = String.join(" ", Arrays.stream(sortedArr).mapToObj(String::valueOf).toArray(String[]::new));
    
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
  public static int[] radixSort(int[] arr, int k) {
    for (int pos = k - 1; pos >= 0; pos--) {
      List<List<Integer>> arrNew = new ArrayList<>(10);
      for (int i = 0; i < 10; i++) {
        arrNew.add(new ArrayList<>());
      }

      // 현재 자릿수에 따라 숫자들을 분류
      for (int num : arr) {
        int digit = getDigit(num, pos);
        arrNew.get(digit).add(num);
      }

      // 분류된 숫자들을 순서대로 새 배열에 저장
      int[] storeArr = new int[arr.length];
      int index = 0;
      for (List<Integer> bucket : arrNew) {
        for (int num : bucket) {
          storeArr[index++] = num;
        }
      }

      // 원본 배열을 새로 정렬된 배열로 교체
      arr = storeArr;
    }

    return arr;
  }

  private static int getDigit(int num, int pos) {
    return (num / (int) Math.pow(10, pos)) % 10;
  }


}