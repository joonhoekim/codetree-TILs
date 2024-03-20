import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = 2;
        int numberOfCandidates = 2;
        int numberOfSequance = 3;
        int[][] combination = new int[numberOfCandidates][numberOfSequance];
        for(int candidate=0; candidate<numberOfCandidates; candidate++) {
            for(int sequance=0; sequance<numberOfSequance; sequance++) {
                combination[candidate][sequance] = sc.nextInt();
            }
        }

        int count = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                checkCombination: 
                for(int k=1; k<=n; k++) {
                    
                    if(
                        (isInCircleRange(i, combination[0][0], range, 1, n)
                        && isInCircleRange(j, combination[0][1], range, 1, n)
                        && isInCircleRange(k, combination[0][2], range, 1, n))
                        ||  
                        (isInCircleRange(i, combination[1][0], range, 1, n)
                        && isInCircleRange(j, combination[1][1], range, 1, n)
                        && isInCircleRange(k, combination[1][2], range, 1, n))
                    ) {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
    
    //if a = 1 >> circledA must be 9 10 1 2 3
    //(1 - 2 + 10)%10+1-1 =    
    static boolean isInCircleRange(int a, int b, int range, int circleStart, int circleEnd) {
        for(int check = -range; check <= range; check++) {
            int circledA = a+check;
            
            if( circledA < circleStart ) {
                circledA = circledA + circleEnd; //0 -> n, -1 -> n-1
            } else if (circleEnd < circledA) {
                circledA = circledA % circleEnd + circleStart - 1;
            }

            if(circledA == b) {
                return true;
            }
        }
        return false;
    }
}