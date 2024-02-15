import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = get1dArr(n1, sc);
        int[] arr2 = get1dArr(n2, sc);
        if(isSubsequance(arr2,arr1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int[] get1dArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static boolean isSubsequance(int[] subArr, int[] superArr) {
        for(int i=0; i<=superArr.length - subArr.length; i++) {
            boolean isSub = true;
            for(int j=0; j<subArr.length; j++) {
                if(superArr[i+j] != subArr[j]){
                    isSub=false;
                    break;
                }
            }
            if(isSub) return true;
        }
        return false;
    }
}