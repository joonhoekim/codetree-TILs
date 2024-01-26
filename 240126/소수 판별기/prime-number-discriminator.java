import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print("C");
                //반복문 다 돈 다음에 bool값으로 판단해도 되지만... 이건 다 안돌아도 되는 예제인걸..
                return;
            }
        }
        System.out.print("P");
    }
}