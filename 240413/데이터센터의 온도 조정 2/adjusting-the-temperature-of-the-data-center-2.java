import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //장비개수
        int[] works = new int[3]; //cool good hot ?
        for(int i=0;i<3;i++) {
            works[i] = sc.nextInt();
        }

        int[][] equips = new int[n][2]; //장비들 Ta, Tb (G는 이상/이하임)
        int minT = 99999;
        int maxT = 0;
        for(int i=0;i<n;i++) {
            equips[i][0] = sc.nextInt();
            equips[i][1] = sc.nextInt();
            minT = Math.min(minT,equips[i][0]);
            maxT = Math.max(maxT,equips[i][1]);
        }

        int maxWork = 0;
        for(int t = minT; t <= maxT; t++) {
            int sumWork = 0;
            for(int i=0; i<n; i++) {
                if(t < equips[i][0]) {
                    sumWork += works[0];
                } else if( t > equips[i][1]) {
                    sumWork += works[2];
                } else {
                    sumWork += works[1];
                }
            }

            maxWork = Math.max(maxWork, sumWork);
        }
        System.out.println(maxWork);
    }
}