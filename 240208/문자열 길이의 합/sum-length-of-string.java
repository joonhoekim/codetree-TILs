import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];


        int count=0;
        int sum=0;
        for(int i=0; i<n; i++){
            //사실 배열로 저장하지 않아도 되지만...
            arr[i] = sc.nextLine();
            if(arr[i].charAt(0)=='a'){
                count++;
            }
            sum+=arr[i].length();
        }
        System.out.println(sum + " "+ count);
    }
}