import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [10];
        int count=0;
        //*5, *10 에서는 모든 경우에서 5의 배수이므로 최대 10번안에 끝난다.
        for(int i=0;i<10;i++){
            arr[i]=n*(i+1);
            System.out.print(arr[i]+" ");
            if(arr[i]%5==0){
                count++;
                if(count==2){
                    break;
                }
            }
        }
    }
}