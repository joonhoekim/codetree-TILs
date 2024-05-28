//1차원 평면상의 선분들이 주어지면, 모든 선분을 포함하는 가장 짧은 선분을 구하기
//단! 하나를 제거해도 된다.
import java.util.Scanner;

class Line {
    int start;
    int end;

    Line(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Line[] lines = new Line[n];
        int minInclLength = Integer.MAX_VALUE;

        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(sc.nextInt(), sc.nextInt());
        }

        for (int deleted = 0; deleted < lines.length; deleted++) {
            //탐색
            int minStart = Integer.MAX_VALUE;
            int maxEnd = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if(i==deleted) continue;
                minStart = Math.min(minStart, lines[i].start);
                maxEnd = Math.max(maxEnd, lines[i].end);
            }
            minInclLength = Math.min(minInclLength, maxEnd - minStart);
        }


        System.out.println(minInclLength);


    }
}