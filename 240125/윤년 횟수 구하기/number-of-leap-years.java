import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =1; i<=n;i++){
            if(i%100==0 && i%400!=0) {
                continue;
            }

            if(i%4==0) {
                count++;
            }
        }
        System.out.print(count);
    }
}