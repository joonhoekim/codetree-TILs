//특정 조건을 만족하는 경우를 완전탐색을 통해 카운팅해라.
// - 1차선 수직선 위에 S, N 두 종류의 알파벳을 둘 것임
//여기서 만족시켜야하는 특정 조건은, '위치'를 대상으로 하며
//가장 가까운 S가 N하고 똑같거나 더 적은 거리에 있는 것임

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int countAlphabet = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        int[] line = new int[1001];
        int countSatisfied = 0;


        for (int i = 0; i < countAlphabet; i++) {
            char input = sc.next().charAt(0);
            int position = sc.nextInt();
            if(input=='S') {
                line[position] = 1;
            } else {
                line[position] = 2;
            }
        }
        

        for (int i = start; i <= end; i++) {
            int minSDist = 9999;
            int minNDist = 9999;
            for (int j = 1; j <= 1000; j++) {

                if(line[j]==1) {
                    minSDist = Math.min(minSDist, Math.abs(i - j));
                }
                if(line[j]==2) {
                    minNDist = Math.min(minNDist, Math.abs(i - j));
                }
            }

            if(minSDist<=minNDist) {
                countSatisfied++;
            }
        }

        System.out.println(countSatisfied);

    }
}