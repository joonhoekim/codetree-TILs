import java.util.Scanner;

public class Main {
    
    static int[] arr;
    static int m;
    static int sum=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        m = sc.nextInt();

        //set the arr
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        while(m>0) {
            calc();
        }
        
        System.out.print(sum);
    }

    static void calc() {

        sum+=arr[m-1];

        if(m%2==1) {
            m-=1;
        } else {
            m = m >> 1;
        }



        
    }
}