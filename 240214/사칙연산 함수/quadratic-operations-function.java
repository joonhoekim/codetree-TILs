import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] query = sc.nextLine().split(" ");
        int a = Integer.parseInt(query[0]);
        char o = query[1].charAt(0);
        int c = Integer.parseInt(query[2]);

        System.out.printf("%d %c %d = %d",a,o,c,operation(a,o,c));
    }

    static int operation(int a, char o, int c) {
        switch(o) {
            case '+': return a+c;
            case '-': return a-c;
            case '*': return a*c;
            case '/': return a/c;
        }
        System.out.println("False");
        System.exit(0);
        return 0;
    }
}