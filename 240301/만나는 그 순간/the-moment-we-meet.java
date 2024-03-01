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
        if (ans==0) {
            ans = -1;
        }
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
                arr[cur--]=time++; 
            }

        } else if(dir == 'R') {
            while(dist-->0) {
                arr[cur++]=time++; 
            }
        }
      }
   }

   static int getFirstEncounter(int[] arrA, int[] arrB) {
    int[] encounterArr = new int[arrA.length];
    int cur = 0;
    for(int i=0; i<arrA.length; i++) {
        if(arrA[i]==arrB[i]) {
            encounterArr[cur++] = arrA[i];
        }
    }

    Arrays.sort(encounterArr);
    for(int i=0; i<encounterArr.length; i++) {
        if(encounterArr[i]!=0) {
            return encounterArr[i];
        }
    }

    return encounterArr[0]; //못찾은 경우 0이 나옴
   }
}