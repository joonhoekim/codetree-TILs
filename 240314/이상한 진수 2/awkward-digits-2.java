import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryInput = sc.next(); 

        //가장 첫번쨰 0을 찾고, 없으면 가장 맨 뒤 1을 0으로 바꾸는 전략이 안 통한다고요..?
        //contains, replaceFirst 쓰면 가장 간단할 것 같은데... 이걸 기본 문법으로 구현하면..
        //해보니까 되긴 하는데, "1", "1111" 이 때가 조건이 달라진다. 완전탐색으로 다시 구현해보자.

        
        int max = 0;
        for(int i=0; i<binaryInput.length(); i++) {
            char[] binaryArr = binaryInput.toCharArray();
            if(binaryArr[i]=='0') {
                binaryArr[i]='1';   
            } else {
                binaryArr[i]='0';
            }
            //int n = Integer.parseInt(new String(binaryArr), 2);
            int n = 0;
            int base = 2;
            for(int j=0;j<binaryArr.length;j++) {
                n = n * base + (binaryArr[j]-'0');
            }
            max = Math.max(max, n);
        }

        System.out.print(max);


        // int idx = -1;
        // for(int i=binaryInput.length()-1; i>0; i--) {
        //     if(binaryInput.charAt(i) == '0') {
        //         idx = i;
        //     }
        // }
        // String originBinary;
        // if(idx != -1) {

        //     originBinary = binaryInput.substring(0,idx) + "1" + binaryInput.substring(idx+1,binaryInput.length());
        // } else {
        //     if(binaryInput.equals("1")) {
        //         System.out.print(0);
        //         return;
        //     }
        //     originBinary = binaryInput.substring(0,binaryInput.length()-1) + "0";
        // }

        // int ans = Integer.parseInt(originBinary, 2);

        // System.out.print(ans);

        
    }
}