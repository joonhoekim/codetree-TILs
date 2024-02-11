import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();

        System.out.print(rightPushMatchingCount(str,target));

    }

    static int rightPushMatchingCount(String input, String answer) {
        int count = 0;
        int len = input.length();

        if(input.equals(answer)) {
            return 0;
        }

        for(int i=0; i<len;i++){
            input = input.substring(len-1,len) + input.substring(0,len-1);
            count++;
            if(input.equals(answer)) {
                return count;
            }
        }
        
        return -1;
    }
}