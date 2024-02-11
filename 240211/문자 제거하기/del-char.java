import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = sc.nextLine().toCharArray();
        int[] removed = new int[cArr.length];
        
        int size = cArr.length;
        while(size>1){
            size=0;
            int n = sc.nextInt();
            if(n>=cArr.length) {
                n=cArr.length-1;
            }
            removed[n]++;
            
            for(int i=0; i<cArr.length; i++){
                if (removed[i]==0){
                    System.out.print(cArr[i]);
                    size++;
                }
            }
            System.out.println("");


        }
    }
}