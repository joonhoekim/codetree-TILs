import java.util.Scanner;

class XY {
    int x1, y1, x2, y2;

    public XY(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XY[] xy = new XY[2];
        for (int i = 0; i < 2; i++) {
            xy[i] = new XY(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println(getLeastArea(xy));
    }

    private static int getLeastArea(XY[] xy) {
        return getLeastWidth(xy) * getLeastHeight(xy);
    }

    private static int getLeastHeight(XY[] xy) {
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < xy.length; i++) {
            minHeight = Math.min(minHeight, xy[i].y1);
            minHeight = Math.min(minHeight, xy[i].y2);
            maxHeight = Math.max(maxHeight, xy[i].y1);
            maxHeight = Math.max(maxHeight, xy[i].y2);
        }

        return maxHeight - minHeight;
    }

    private static int getLeastWidth(XY[] xy) {
        int minWidth = Integer.MAX_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        for (int i = 0; i < xy.length; i++) {
            minWidth = Math.min(minWidth, xy[i].x1);
            minWidth = Math.min(minWidth, xy[i].x2);
            maxWidth = Math.max(maxWidth, xy[i].x1);
            maxWidth = Math.max(maxWidth, xy[i].x2);
        }

        return maxWidth - minWidth;
    }


}