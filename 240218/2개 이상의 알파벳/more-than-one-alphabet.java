import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(DupChar(A)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    static boolean DupChar(String str) {
        int[] counter = new int[26];
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i) - 'a';
            counter[idx]++;
        }

        for(int i=0;i<counter.length;i++){
            if(counter[i]>1) {
                return true;
            }
        }
        return false;
    }
}