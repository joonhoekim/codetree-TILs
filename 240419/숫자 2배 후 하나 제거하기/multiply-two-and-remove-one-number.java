import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        

        //배열초기화
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //최소의 sum of diff를 구할 것
        int minDiff = Integer.MAX_VALUE;

        //하나를 두 배 하고
        for(int doubled = 0; doubled<n; doubled++) {
            arr[doubled] *= 2;
            
            //하나를 제거한다.
            for(int deleted = 0; deleted<n; deleted++) {
                int[] deletedArr = new int[n-1];
                int count = 0;
                //하나를 제거한 배열을 초기화한다.
                for(int index=0; index<n; index++) {
                    if(index==deleted) continue;
                    deletedArr[count++] = arr[index];
                }

                //하나를 제거한 배열들에서 차이를 합산한다.
                int sumDiff = 0;
                for(int selected=0; selected<deletedArr.length - 1; selected++) {
                    sumDiff += Math.abs(deletedArr[selected] - deletedArr[selected+1]);
                }
                //최소값을 갱신한다.
                minDiff = Math.min(minDiff, sumDiff);
            }
            //2배 한 것을 되돌린다.
            arr[doubled] /= 2;
        }

        //최소값을 출력한다.
        System.out.println(minDiff);
        
    }
}