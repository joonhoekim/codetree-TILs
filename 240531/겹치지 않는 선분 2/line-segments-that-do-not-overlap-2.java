import java.util.Scanner;

class Line {
    int startX;
    //    int startY = 0;
    int endX;
    //    int endY = 1;
    boolean overwrap = false;

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
            for (int j = 0; j < n; j++) {
                //자기 자신은 검사대상이 아니다.
                if (i == j) continue;
                //겹침 상태에 있다면 이 선분을 포함하는 다른 선분이 있으니 볼 필요가 없다.
                //단 겹침 상태에 있는 선분[i]도 다른 추가 선분[j]들과 겹칠 수 있으므로 검사는 해야 한다.
                if (lines[j].overwrap) continue;

                if (isOverwrapping(lines[i], lines[j])) {
                    lines[i].overwrap = true;
                    lines[j].overwrap = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!lines[i].overwrap) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static boolean isOverwrapping(Line wrapper, Line wrapped) {
        //조건상 입력에서 시작,끝점이 겹쳐지지 않는다고 하니 고려하지 않음
        if (wrapped.startX < wrapper.startX) {
            if (wrapped.endX >= wrapper.endX) return true;
        } else {
            if (wrapped.endX <= wrapper.endX) return true;
        }


        return false;
    }
}