import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(arr);

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 최대 힙 구성
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // 힙에서 요소를 하나씩 추출
        for (int i = n - 1; i > 0; i--) {
            // 현재 루트를 끝으로 이동
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 줄어든 힙에 대해 heapify 호출
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 왼쪽 자식이 루트보다 크면
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // 오른쪽 자식이 지금까지의 가장 큰 값보다 크면
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // largest가 루트가 아니면
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // 재귀적으로 영향받은 하위 트리에 대해 heapify
            heapify(arr, n, largest);
        }
    }
}