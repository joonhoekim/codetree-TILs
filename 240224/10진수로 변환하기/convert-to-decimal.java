import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputBin = sc.next();
        int len = inputBin.length();
        int[] inputArr = new int[len];
        for(int i=0; i<len; i++) {
            inputArr[i] = inputBin.charAt(i) - '0';
        }

        int n=0;
        for(int i=0; i<len; i++) {
            n = n*2 + inputArr[i];
        }

        System.out.println(n);
    }
}