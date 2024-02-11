import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }

        String sumStr = Integer.toString(sum);
        sumStr = sumStr.substring(1)+sumStr.charAt(0);

        System.out.print(sumStr);
        
    }
}