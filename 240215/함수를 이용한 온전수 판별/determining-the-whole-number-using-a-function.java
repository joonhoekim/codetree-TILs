import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(countComplete(a,b));
    }

    static int countComplete(int a, int b) {
        int count = 0;
        for(int i=a;i<=b;i++){
            if(i%2==0) {
                continue;
            }
            if(i%10==5) {
                continue;
            }
            if(i%3==0 && i%9!=0){
                continue;
            }
            
            count++;
        }
        return count;
    }
}