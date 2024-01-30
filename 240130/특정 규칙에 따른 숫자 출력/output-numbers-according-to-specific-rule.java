import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count = 1;

        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(i>j){
                    System.out.print("  ");
                } else {
                    if(count==10){
                        count=1;
                    }
                    System.out.print(count++ + " ");
                }
            }
            System.out.print("\n");
        }
    }
}