import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int larger = Math.max(a,b);
        int smaller = Math.min(a,b);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int largerPortal = Math.max(x,y);
        int smallerPortal = Math.min(x,y);
        
        
        //그냥 가는 경우와 순간이동을 사용하는 경우가 있을텐데
        //생각보다 가지수가 많아서.. 분류대로 구하고 최소값 구하자
        int stdDist = larger - smaller;
        int portalDist = Math.abs(smaller-smallerPortal) + Math.abs(larger-largerPortal);
        int minDist = Math.min(stdDist, portalDist);
        System.out.print(minDist);
    }
}