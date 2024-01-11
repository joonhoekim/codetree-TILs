import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] thirtyOne = {1,3,5,7,8,10,12};
        for(int i = 0; i<thirtyOne.length; i++) {
            if (thirtyOne[i] == n) {
                System.out.println(31);
                return;
            }
        }
        if(n==2) {
            System.out.println(28);
        } else {
            System.out.println(30);
        }
    }
}