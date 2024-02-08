import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        int[] lengths = new int[n];
        for(int i=0; i<n; i++){
            lengths[i]=sc.next().length();
        }


        final int MIN = 0;
        final int MAX = 20;
        int max=0;
        int min=20;

        for(int i=0;i<n;i++){
            if(lengths[i]>max){
                max=lengths[i];
            }
            if(lengths[i]<min){
                min=lengths[i];
            }
        }

        System.out.print(max-min);
    }
}