import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*

         *
         * A B D C
         * D C B A - A C B D - A B C D
         * D B C A - A B C D
         * B C A D - A C B D - A B C D ...
         *
         * 상황
         * 여러 수열이 들어오는데,
         * 원소간의 교환만 가능한 상태에서
         * 정렬하는데 필요한 최소교환횟수를 구하는 문제
         *
         * 이해
         * 왼쪽, 혹은 오른쪽부터 정렬한다고 생각하면서 나아가면 된다. (버블정렬처럼)
         *
         * 분석
         * 횟수만 구하면 되니까 더 나은 방법이 있을까? 정렬을 직접 수행하면 n^2
         *
         * 설계
         * 우선 정렬하면서 count 해보자.
         * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0) - 'A';
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            int maxIdx = i;

            for (int j = i; j < n; j++) {

                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }

            }

            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
                count++;
            }


        }

        System.out.println(count);


    }
}