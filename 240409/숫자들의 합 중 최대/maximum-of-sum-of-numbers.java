import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for(int i=a; i<=b; i++){
            int num = i;
            int[] digit = new int[5];
            for(int j=0; j<5; j++){
                digit[j] = num%10;
                num/=10;
            }

            int sum = 0;
            for(int k=0; k<5; k++) {
              sum+=digit[k];
            }

            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}