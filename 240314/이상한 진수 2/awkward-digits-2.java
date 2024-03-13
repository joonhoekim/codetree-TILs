import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryInput = sc.next(); 

        //가장 첫번쨰 0을 찾고, 없으면 가장 맨 뒤 1을 0으로 바꾸는 전략이 안 통한다고요..?
        //contains, replaceFirst 쓰면 가장 간단할 것 같은데... 이걸 기본 문법으로 구현하면
        int idx = -1;
        for(int i=binaryInput.length()-1; i>0; i--) {
            if(binaryInput.charAt(i) == '0') {
                idx = i;
            }
        }
        String originBinary;
        if(idx != -1) {

            originBinary = binaryInput.substring(0,idx) + "1" + binaryInput.substring(idx+1,binaryInput.length());
        } else {
            if(binaryInput.equals("1")) {
                System.out.print(0);
                return;
            }
            originBinary = binaryInput.substring(0,binaryInput.length()) + "0";
        }

        int ans = Integer.parseInt(originBinary, 2);

        System.out.print(ans);

        
    }
}