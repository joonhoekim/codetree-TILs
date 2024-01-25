import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int area = sc.nextInt() * sc.nextInt();

            System.out.println(area);

            if(sc.next().equals("C")){
                break;
            }
        }
    }
}