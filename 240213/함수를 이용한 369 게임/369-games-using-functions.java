import java.util.Scanner;

public class Main {

    static boolean have369(int i) {
        if(String.valueOf(i).contains("3") ||
        String.valueOf(i).contains("6") ||
        String.valueOf(i).contains("9")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean mulOf3(int i) {
        if(i%3==0){
            return true;
        } else{
            return false;
        }
    }

    static int test369(int a, int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(have369(i) || mulOf3(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(test369(a,b));
    }
}