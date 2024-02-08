import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);

        String[] arr = { "apple", "banana", "grape", "blueberry","orange"};

        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=3-1; j<=4-1; j++){

                if(arr[i].charAt(j) == target){
                    count++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        System.out.println(count);
    }
}