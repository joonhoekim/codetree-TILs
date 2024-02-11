import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr= sc.nextLine().toCharArray();
        int len = arr.length;
        int sum = 0;

        for(int i=0;i<len;i++){
            char target = arr[i];
            
            // if('A' <= target && target <= 'Z') {
            //     System.out.printf("%c",target+32);
            // } else if('a' <= target && target <= 'z'){
            //     System.out.printf("%c",target);
            if('0' <= target && target <= '9') {
                sum+=Integer.valueOf(target-'0');
            }else {
                continue;
            }
        }

        System.out.print(sum);


    }
}