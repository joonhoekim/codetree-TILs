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
        //i는 정렬되지 않은 부분의 시작 idx이다.
        for (int i = 1; i < arr.length; i++) {
            //key는 삽입할 대상이다. 여기서는 정렬되지 않은 부분의 시작점이다.
            int key = arr[i];
            //j는 정렬된 부분의 마지막 idx이다.
            int j = i - 1;

            //만약 key보다 크면, key가 더 안쪽으로 들어가야 하니까 밀어내는 과정이다.
            //'밀어내는 방식'이기 때문에 key만 기억하고 있으면 된다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            //공간을 다 만들었으면, key를 넣어준다.
            arr[j + 1] = key;
        }
    }
}