import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //첨엔 클래스 만들어서 UDD 만들었는데, 오히려 반복문에서 다루기가 어려워서 이차원 배열로 만듦.
        int[][] points = new int [n][2];// 1st for point, 2nd for x and y
        
        //initialize points
        for(int i=0; i<points.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i][0] = x;
            points[i][1] = y;
        }


        //최소값 구할 것이므로 갱신할 변수 선언
        int globalMinDist = Integer.MAX_VALUE;

        //POINTS: 초기 반복문 설계는 완전탐색하는 형태를 따른다.
        //두 점 사이의 거리를 구할 것이므로, 두 점을 정의하는 형태이다.
        for(int i=0; i<points.length-1; i++) {
            for(int j=i+1; j<points.length; j++) {
                

                //그리고 dist 구하는데 그 둘을 제외하는 조건을 추가한다.
                for(int k=0; k<points.length; k++) {
                    if (k==i || k==j) continue;
                }

                int x1 = points[i][0];
                int x2 = points[j][0];
                int y1 = points[i][1];
                int y2 = points[j][1];
                int dist = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

                globalMinDist = Math.min(globalMinDist, dist);
            }
        }
        System.out.println(globalMinDist);
    }
}