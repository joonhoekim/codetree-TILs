import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            String command = sc.next();
            if(command.equals("push")) {
                int value = sc.nextInt();
                stack.push(value);
            } else if(command.equals("size")) {
                System.out.println(stack.size());
            } else if(command.equals("pop")) {
                System.out.println(stack.pop());
            } else if(command.equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(command.equals("top")) {
                System.out.println(stack.peek());
            }

        }

    }
}