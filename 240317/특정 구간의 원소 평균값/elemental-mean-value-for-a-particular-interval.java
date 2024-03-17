//아직은 구간이다. 구간이라는 연속성이 없어지면 백트래킹이 된다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for(int i=0;i<n;i++) {
            arr[i]=(float) sc.nextInt();
        }

        int count = 0;
        for(int start=0; start<n; start++) {
            for(int end=start; end<n; end++) {
                float sum=0;
                for(int cursor=start; cursor<=end; cursor++) {
                    sum+=arr[cursor];
                }
                float average = sum/(float) (end-start+1);
                for(int cursor=start; cursor<=end; cursor++) {
                    if(average == arr[cursor]) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}