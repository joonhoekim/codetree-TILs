import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of student 
        int m = sc.nextInt(); // number of record
        int k = sc.nextInt(); // criteria (equal to OR greater than)

        int[][] penaltyBoard = new int [n][k]; //row = each student, col = penalty rec
        for(int i=0; i<m; i++) {
            int studentNo = sc.nextInt() - 1;
            for(int j=0; j<k; j++) {
                if(penaltyBoard[studentNo][j] == 0) {
                    penaltyBoard[studentNo][j] = 1;

                    if(j==k-1) {
                        System.out.print(studentNo + 1);
                        return;
                    }
                    break; //get penalty = 1 
                }

                
            }
        }

        System.out.print(-1);

    }
}