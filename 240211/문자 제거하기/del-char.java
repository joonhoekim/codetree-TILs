import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //이 문제는, 제거한 문자열을 기준으로 인덱스를 적용하는 것인지
        //제거하기 전 문자열의 인덱스를 기준으로 제거한다는 것인지
        //그게 명확하지가 않아서 예제를 보고 판단해야하네...
        //예제 보면 '제거한 후 문자열'이 기준이 된다.

        //만약 최초 문자열을 계속 기준으로 한다면
        //인덱스를 나타내는 배열을 만들어서 푸는 게 좋다.
        
        int size = str.length();
        do {
            int n = sc.nextInt();
            if(n >= str.length()){
                str = str.substring(0,str.length()-1);
                size--;
                System.out.println(str);
                continue;
            } else {
                str = str.substring(0,n) + str.substring(n+1,str.length());
                size--;
                System.out.println(str);
            }
        } while (size > 1);
        
    }
}