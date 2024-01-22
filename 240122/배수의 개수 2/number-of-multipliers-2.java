import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddCount = 0;
        for(int i = 0; i<10; i++) {
            if(i%2==1) {
                oddCount++;
            } 
        }
        System.out.print(oddCount);        
    }
}