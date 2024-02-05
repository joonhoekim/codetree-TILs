import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int size=n;
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        //int max = arr[0];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<size; i++) {
            if(arr[i]>max1) {
                max1 = arr[i];
            } 
        }

        int count = 0;
        for(int i=0; i<size; i++) {
            if(arr[i] == max1) {
                count++;
                if(count>1) {
                    max2 = max1;
                    break;
                }
            }
            
            if(arr[i]>max2 && arr[i]!=max1 ){
                max2= arr[i];
            }

        }


       



        System.out.print(max1+" "+max2);
    }
}