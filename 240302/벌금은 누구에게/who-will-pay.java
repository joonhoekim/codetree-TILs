import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of student 
        int m = sc.nextInt(); // number of record
        int k = sc.nextInt(); // criteria (equal to OR greater than)

        int[] penaltyBoardThatIdxIsStdNo = new int [n+1]; //row = each student, col = penalty rec
        for(int i=0; i<m; i++) {
            int studentNo = sc.nextInt();

            if(++penaltyBoardThatIdxIsStdNo[studentNo] == k) {
                System.out.print(studentNo);
                return;
            }
        }

        System.out.print(-1);

    }
}