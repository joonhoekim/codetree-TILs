import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        int idx = str.indexOf(target);
        if(idx!=-1){
            System.out.print(idx);
        } else{
            System.out.print("No");
        }
    }
}