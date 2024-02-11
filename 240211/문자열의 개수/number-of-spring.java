import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();
        int count = 0;
        while(!input.equals("0")) {
            count++;
            if(count%2==1) {
                sb.append(input+"\n");
            }
            input = sc.nextLine();
        }
        System.out.println(count);
        System.out.println(sb);
    }
}