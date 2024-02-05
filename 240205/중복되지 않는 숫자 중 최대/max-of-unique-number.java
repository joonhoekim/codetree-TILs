import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //배열 1000개 만들어서 쓰는게 구현이 쉽다. 
        //메모리를 N개만큼만 쓰는 것도 구현해보자.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[j]==arr[i]) {
                        count++;
                    }
                }
                if(count==1){
                    max=arr[i];
                }
            }
        }

        System.out.print(max);



    }
}