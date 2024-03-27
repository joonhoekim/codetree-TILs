import java.util.Scanner;
//이 문제는 재귀함수를 두 개 쓰면 안되는 문제인가?
//product, sum of digits 두 개로 분리하여 생각한다면 이전에 푼 문제와 동일한데..

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        int length = 3;
        System.out.println(getSumOfDigits(getProduct(count, sc)));
    }

    static int getProduct(int count, Scanner sc) {
        if(count == 0) {
            return 1;
        }
        int input = sc.nextInt();
        return getProduct(count-1, sc) * input;
    }

    static int getSumOfDigits(int number) {
        if(number==0) {
            return 0;
        }
        return number%10 + getSumOfDigits(number/10);
    }
}