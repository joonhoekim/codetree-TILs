import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] xArr = new int[N];
        int[] yArr = new int[N];
        for(int i=0; i<N; i++) {
            xArr[i] = sc.nextInt();
            yArr[i] = sc.nextInt();
        }

        int globalMin = Integer.MAX_VALUE;
        //점의 좌표는 홀수로 이뤄짐, 겹쳐지지 않음.
        for(int x=2; x<=98; x+=2) {
            for(int y=2; y<=98; y+=2) {
                
                globalMin = Math.min(globalMin, checkMax(x, y, xArr, yArr));
            }
        }

        System.out.println(globalMin);
    }

    static int checkMax(int x, int y, int[] xArr, int[] yArr) {
        //1,2,3,4 분면 => idx 0 1 2 3
        int[] quadrant = new int[4];
        int N = xArr.length;
        for(int i=0; i<N; i++) {
            //1사분면
            if(xArr[i]>x && yArr[i]>y) {
                quadrant[0]++;
            } 
            //2사분면
            else if(xArr[i] < x && yArr[i]>y) {
                quadrant[1]++;
            }
            //3사분면
            else if(xArr[i] < x && yArr[i] < y) {
                quadrant[2]++;
            } else {
                quadrant[3]++;
            }
        }

        int max = 0;
        for(int i=0; i<quadrant.length; i++) {
            max = Math.max(max, quadrant[i]);
        }

        return max;
    }
}