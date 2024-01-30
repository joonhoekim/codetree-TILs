import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output;
        for(int i=1;i<=n;i++){
            output = i;
        
            for(int j=1; j<=n; j++){
                System.out.print(output);
                if(output==i){
                    output=n-i+1;
                } else {
                    output = i;
                }
            }
            System.out.print("\n");
        }       
    }
}