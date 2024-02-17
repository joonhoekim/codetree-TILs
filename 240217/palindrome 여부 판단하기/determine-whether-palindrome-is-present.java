import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        isPalindrome(A);
    }

    static void isPalindrome(String input){
        for(int i = 0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}