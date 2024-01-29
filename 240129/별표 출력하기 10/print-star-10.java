import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;

        //대칭이니 분할하고, 반복횟수는
        //홀수행은 i 따라 증가
        //짝수행은 n-i로 감소

        for (int i=1;i<=n;i++){
            if(i%2==1){
                count = i/2+1;
                for(int j=0;j<count;j++) {
                    System.out.print("* ");
                }
            } else {
                count = n-i/2+1;
                for(int j=0;j<count;j++){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        for (int i=n;i>=1;i--){ //이 행만 바꿔주면 된다.
            if(i%2==1){
                count = i/2+1;
                for(int j=0;j<count;j++) {
                    System.out.print("* ");
                }
            } else {
                count = n-i/2+1;
                for(int j=0;j<count;j++){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        
    }
}