import java.util.Scanner;

class RectangleLeftBottomAndRightTop {
    int x1, y1, x2, y2;

    public RectangleLeftBottomAndRightTop(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleLeftBottomAndRightTop[] rectangleLeftBottomAndRightTop = new RectangleLeftBottomAndRightTop[2];
        for (int i = 0; i < 2; i++) {
            rectangleLeftBottomAndRightTop[i] = new RectangleLeftBottomAndRightTop(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println(getLeastArea(rectangleLeftBottomAndRightTop));
    }

    private static int getLeastArea(RectangleLeftBottomAndRightTop[] rectangleLeftBottomAndRightTop) {
        return getLeastWidth(rectangleLeftBottomAndRightTop) * getLeastHeight(rectangleLeftBottomAndRightTop);
    }

    private static int getLeastHeight(RectangleLeftBottomAndRightTop[] rectangleLeftBottomAndRightTop) {
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < rectangleLeftBottomAndRightTop.length; i++) {
            minHeight = Math.min(minHeight, rectangleLeftBottomAndRightTop[i].y1);
            minHeight = Math.min(minHeight, rectangleLeftBottomAndRightTop[i].y2);
            maxHeight = Math.max(maxHeight, rectangleLeftBottomAndRightTop[i].y1);
            maxHeight = Math.max(maxHeight, rectangleLeftBottomAndRightTop[i].y2);
        }

        return maxHeight - minHeight;
    }

    private static int getLeastWidth(RectangleLeftBottomAndRightTop[] rectangleLeftBottomAndRightTop) {
        int minWidth = Integer.MAX_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        for (int i = 0; i < rectangleLeftBottomAndRightTop.length; i++) {
            minWidth = Math.min(minWidth, rectangleLeftBottomAndRightTop[i].x1);
            minWidth = Math.min(minWidth, rectangleLeftBottomAndRightTop[i].x2);
            maxWidth = Math.max(maxWidth, rectangleLeftBottomAndRightTop[i].x1);
            maxWidth = Math.max(maxWidth, rectangleLeftBottomAndRightTop[i].x2);
        }

        return maxWidth - minWidth;
    }


}