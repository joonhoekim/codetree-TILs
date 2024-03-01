import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        int arrSize = 1000*1000*2 + 1;
        int offset = arrSize >> 2;

        //value = time
        int[] arrA = new int[arrSize];
        int[] arrB = new int[arrSize];
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        exec(arrA, n, offset);
        exec(arrB, m, offset);

        int ans = getFirstEncounter(arrA, arrB);
        
        System.out.print(ans);
   }

   static void exec(int[] arr, int n, int offset) {
    int cur = offset;
    int time = 0;
      for(int i=0; i<n; i++){
        char dir = sc.next().charAt(0);
        int dist = sc.nextInt();
        
        if(dir == 'L') {
            while(dist-->0) {
                arr[--cur]=++time; 
            }

        } else if(dir == 'R') {
            while(dist-->0) {
                arr[++cur]=++time; 
            }
        }
      }
   }

   static int getFirstEncounter(int[] arrA, int[] arrB) {
    int[] encounterArr = new int[arrA.length];
    int min = Integer.MAX_VALUE;
    for(int i=0; i<arrA.length; i++) {
        if(arrA[i] != 0 && arrB[i] != 0 && arrA[i]==arrB[i]) {
            min = Math.min(arrA[i], min);
        }
    }
    if(min == Integer.MAX_VALUE) {
        return -1;//못 찾은 경우 -1
    }
    return min; 
   }
}