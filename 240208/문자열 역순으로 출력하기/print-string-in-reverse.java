import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char target = sc.next().charAt(0);

        String[] arr = new String[4];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        //System.out.println(count);
    }
}