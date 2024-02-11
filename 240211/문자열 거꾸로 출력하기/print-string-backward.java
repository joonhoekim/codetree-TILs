import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("END")) {

            StringBuilder sb = new StringBuilder();
            sb.append(input).reverse();
            System.out.println(sb);

            input = sc.nextLine();
        }
    }
}