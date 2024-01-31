import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prime Number 정의대로 하면 조건검사를 한번 더 해야 한다.
        //정의 : 1과 자기자신이 약수
        //간단화 : 2는 소수고, 3부터는 2부터 자기자신-1 까지 나머지 검사
        int n=sc.nextInt();
        System.out.print("2 ");
        loop: for(int i=3; i<=n; i++){
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    continue loop;
                }
            }
            System.out.print(i+" ");
        }

    }
}