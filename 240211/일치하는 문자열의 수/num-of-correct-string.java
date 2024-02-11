import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String[] strs = new String[n];
        int count = 0;
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
            if(str.compareTo(strs[i]) == 0) {
                count++;
            }
        }

        System.out.print(count);
        
    }
}