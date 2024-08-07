public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    }
}package exhaustiveSearch.케이스별로나누기.좋은전략을추려내기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    /*
     * 문제
     * - 10만개 정도의 수가 주어질 때,
     * - 3개 곱해서 나올 수 있는 최댓값 구하기
     * 분석
     * - 수가 1000개 주어진다.
     * - 완전탐색하는 경우 1000^3 = 10^9 < 21.4억 미만임
     * 설계
     * - 일단 완전탐색으로 풀어보자(아마 시간초과?)
     * - 음수 * 음수 * 양수 혹은 양수 * 양수 * 양수
     * - 즉 짝수개의 음수를 곱하는 게 전략일 것이다.
     * 구현
     * - 일단 무식하게 구해보자
     * */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    globalMax = Math.max(globalMax,
                                         arr[i] * arr[j] * arr[k]);
                }
            }
        }

        System.out.println(globalMax);

    }
}