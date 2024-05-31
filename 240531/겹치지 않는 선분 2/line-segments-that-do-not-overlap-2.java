import java.util.Scanner;

class Line {
    int startX;
    int endX;
    boolean overwraped = false;

    Line(int startX, int endX) {
        this.startX = startX;
        this.endX = endX;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        Line[] lines = new Line[n];

        for (int i = 0; i < n; i++) {
            lines[i] = new Line(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            //겹침 상태에 있다면 이 선분을 포함하는 다른 선분이 있으니 볼 필요가 없다.
            if (lines[i].overwraped) continue;
            for (int j = 0; j < n; j++) {
                //자기 자신은 검사대상이 아니다.
                if (i == j) continue;
                if (lines[j].overwraped) continue;

                if (isOverwrapping(lines[i], lines[j])) {
                    lines[i].overwraped = true;
                    lines[j].overwraped = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(!lines[i].overwraped) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static boolean isOverwrapping(Line wrapper, Line wrapped) {
        return wrapper.startX <= wrapped.startX && wrapped.endX <= wrapper.endX;
    }
}