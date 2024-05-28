//비둘기가 이동한 횟수를 구하기 (장소는 왼쪽, 오른쪽 둘 뿐)

import java.util.Scanner;

class Pigeon {
    int counter = 0;

    //초기값은 -1로 두자.
    int place = -1;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pigeonNum = 10;
        int count = 0;
        Pigeon[] pigeons = new Pigeon[pigeonNum];

        for (int i = 0; i < n; i++) {
            int target = sc.nextInt() - 1;
            int place = sc.nextInt();
            if(pigeons[target] == null) {
                pigeons[target] = new Pigeon();
            }
            if(pigeons[target].place!=place) {
                //처음 관측된 경우
                if(pigeons[target].place == -1) {
                    pigeons[target].place = place;
                    continue;
                }

                pigeons[target].place = place;
                count++;
            }
        }

        System.out.println(count);

    }
}