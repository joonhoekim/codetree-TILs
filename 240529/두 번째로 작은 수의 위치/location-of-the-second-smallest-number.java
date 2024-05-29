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

        Arrays.sort(arr);
        int min = arr[0];
        int secondaryMinPos = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > min) {
                secondaryMinPos = i+1;
                break;
            }
        }

        if(secondaryMinPos == 1) {
            return -1;
        }

        return secondaryMinPos;
    }
}