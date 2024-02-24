import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[201]; //음수가 가능해서 양수화 생각해야 함...

        for(int i=0;i<n;i++) {
            int x1 = sc.nextInt()+100; //최소값을 더해서 0+양수화해준다.
            int x2 = sc.nextInt()+100;

            for(int j=x1; j<x2; j++) { //구간이니 끝은 제외하는 방식을 쓴다. 지점이면 포함하고..
                line[j]++;
            }
        }

        //가장 많이 겹치는 구간이 어디인지는 궁금하지 않은 문제이므로...
        Arrays.sort(line);
        System.out.print(line[200]);
    }
}