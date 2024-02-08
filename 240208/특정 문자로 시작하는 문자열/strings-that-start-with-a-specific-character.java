import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        char target = sc.next().charAt(0);

        int lenSum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i].charAt(0)==target){
                lenSum+=arr[i].length();
                count++;
            }
        }

        double avg = (double) lenSum / count;
        System.out.printf("%d %.2f",count,avg); 
    }
}