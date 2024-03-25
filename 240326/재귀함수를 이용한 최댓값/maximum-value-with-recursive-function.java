import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getMaxFromSerialInput(n, sc));
    }

    static int getMaxFromSerialInput(int count, Scanner sc) {
        if(count==0) {
            return 0;
        }
        int input = sc.nextInt();
        int max = getMaxFromSerialInput(count-1, sc);
        return Math.max(max, input);

    }
}