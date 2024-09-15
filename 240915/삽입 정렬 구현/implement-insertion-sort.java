import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        //스트림으로 입력 처리하기
        int[] arr = Arrays.stream(br.readLine().split(" "))
        //메서드 참조
        .mapToInt(Integer::parseInt)
        //타입 변환
        .toArray();

        insertionSort(arr);

        StringBuilder sb = new StringBuilder();
        for(int el : arr) {
            sb.append(el).append(" ");
        }

        System.out.print(sb);
        br.close();
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}