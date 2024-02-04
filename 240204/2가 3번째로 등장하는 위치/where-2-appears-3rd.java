import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int idx2=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(arr[i]==2){
                count2++;
                if(count2==3){
                    idx2=i;
                    break;
                }
            }
        }

        System.out.print(idx2+1);
    }
}