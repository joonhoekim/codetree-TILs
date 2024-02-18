import java.util.Scanner;

public class Main {
    public static String input;
    public static String target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.next();
        target = sc.next();

        System.out.print(getSubsequanceIndex(input,target));
    }

    static int getSubsequanceIndex(String input, String target) {
        
        for (int i=0;i<input.length()-target.length()+1;i++) {
            boolean satisfied = true;
            for (int j=0; j<target.length(); j++) {
                boolean test = (input.charAt(i+j) == target.charAt(j));
                if(!test) {
                    //이번 i에서는 아니니 나간다.
                    satisfied = false;
                    break;
                }
            }
            //나오면 satisfied 검사한다. s=true 면 부분수열이었다는 것이다.
            if(satisfied) {
                return i;
            } 
        }
        //다 돌았는데도 일치하는 부분문자열이 없어서 아직까지 리턴하지 못했으면 -1 리턴한다.
        return -1;
    }
}