//문제 자체가 recursive definition을 구현하라는 문제이므로
//이런 경우는 recursive function을 통해 구현하자.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getAns(n));
    }

    static int getAns(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        return getAns(n/3) + getAns(n-1);
    }
}