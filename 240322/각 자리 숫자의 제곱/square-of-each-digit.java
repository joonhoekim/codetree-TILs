import java.util.Scanner;

public class Main {
    static int getSumOfDigitsSquare(int n){
        //끝내는 조건
        if(n==0) {
            return 0;
        }


        //반복하는 부분
        //들어온 수의 맨 뒷자리의 제곱을 구한다.
        int squaredLastDigit = (int) Math.pow(n%10, 2);
        
        //한자리 오른쪽으로 쉬프트한다.
        n = n/10;

        //결국 재귀적으로 전부 더하게 한다.
        return squaredLastDigit + getSumOfDigitsSquare(n) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getSumOfDigitsSquare(n));
    }
}