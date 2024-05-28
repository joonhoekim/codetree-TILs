import java.util.Scanner;

class Rect2Points {
    int x1, y1, x2, y2;

    public Rect2Points(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect2Points[] rect2Points = new Rect2Points[2];
        for (int i = 0; i < 2; i++) {
            rect2Points[i] = new Rect2Points(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println(getLeastSquareArea(rect2Points));
    }

    private static int getLeastSquareArea(Rect2Points[] rect2Points) {
        return (int) Math.pow(Math.max(getLeastHeight(rect2Points), getLeastWidth(rect2Points)), 2);
    }

    private static int getLeastArea(Rect2Points[] rect2Points) {
        return getLeastWidth(rect2Points) * getLeastHeight(rect2Points);
    }

    private static int getLeastHeight(Rect2Points[] rect2Points) {
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < rect2Points.length; i++) {
            minHeight = Math.min(minHeight, rect2Points[i].y1);
            minHeight = Math.min(minHeight, rect2Points[i].y2);
            maxHeight = Math.max(maxHeight, rect2Points[i].y1);
            maxHeight = Math.max(maxHeight, rect2Points[i].y2);
        }

        return maxHeight - minHeight;
    }

    private static int getLeastWidth(Rect2Points[] rect2Points) {
        int minWidth = Integer.MAX_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        for (int i = 0; i < rect2Points.length; i++) {
            minWidth = Math.min(minWidth, rect2Points[i].x1);
            minWidth = Math.min(minWidth, rect2Points[i].x2);
            maxWidth = Math.max(maxWidth, rect2Points[i].x1);
            maxWidth = Math.max(maxWidth, rect2Points[i].x2);
        }

        return maxWidth - minWidth;
    }


}