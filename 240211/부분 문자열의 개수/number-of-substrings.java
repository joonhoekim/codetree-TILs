import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length()-target.length()+1;i++){
            String sub = str.substring(i,i+target.length());
            if(sub.contains(target)){
                count++;
            }
        }
        System.out.print(count);
    }
}