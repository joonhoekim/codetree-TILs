//두번째로 작은 숫자의 위치구하기

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        if(n<=1) {
            return -1;
        }
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arrCopied = arr.clone();
        Arrays.sort(arr);
        int min = arr[0];
        int secondaryMin = -1;

        //두번째로 작은 수 찾기
        for (int i = 1; i < n; i++) {
            if(arr[i] > min) {
                secondaryMin = arr[i];
                break;
            }
        }

        //없다면 -1 반환
        if(secondaryMin == -1) {
            return -1;
        }

        //있다면 두번째로 작은 수가 한개인지 검사하기
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == secondaryMin) {
                count++;
            }

            if(count == 2) {
                return -1;
            }
        }

        int secondaryMinPos = 0;
        for (int i = 0; i < n; i++) {
            if(arrCopied[i] == secondaryMin) {
                secondaryMinPos = i+1;
            }
        }

        return secondaryMinPos;
    }
}