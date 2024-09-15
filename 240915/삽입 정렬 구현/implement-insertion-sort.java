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
        int unsortedIdx = 0;
        int minIdx = 0;

        while(unsortedIdx < arr.length) {

            //최솟값 인덱스를 구해서...
            minIdx = IntStream.range(unsortedIdx, arr.length)
            .reduce((acc, check) -> arr[acc] <= arr[check] ? acc : check)
            .getAsInt();

            //가장 작은 인덱스에 삽입해서 정렬한다.
            swap(arr, unsortedIdx++, minIdx);

            //시간복잡도는 엔스퀘어로 동일하지만,
            //삽입 정렬이 스왑이 제일 적다. 그 다음은 선택 정렬이다. 버블정렬은 가장 비효율적이다.

        }
    }

    static void swap(int[] arr, int idxA, int idxB) {
        int temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
    }
}