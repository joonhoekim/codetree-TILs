import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                //별이 출력되는 조건으로 해결 가능
                //첫행인 경우(i==1)
                //짝수행인 경우 j<=i 인 경우

                if(i==1) {
                    System.out.print("* ");
                } else if(j%2==0 && j>=i) { //이거 이렇게 푸는거구나..!!
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}