import java.util.Scanner;

public class Main {

    static void printer(int n, int m){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(count++ + " ");
                if(count == 10) {
                    count = 1;
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        printer(n,m);
    }

    
}