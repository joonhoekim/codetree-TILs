import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                count=n*(i-1)+1;
                for(int j=1; j<=n; j++){
                    System.out.print(count+++" ");
                }
            } else {
                count=n*i;
                for(int j=1; j<=n; j++){
                    System.out.print(count--+" ");
                }
            }
            
            System.out.print("\n");
        }       
    }
}