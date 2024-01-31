import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countPass =0;

        for(int i=0;i<n;i++){
            int[] scores = new int[4];
            int scoreSum = 0;
            for( int j=0;j<4;j++) {
                scores[j] = sc.nextInt();
                scoreSum+=scores[j];
            }
            int avg = scoreSum/4; //소수점 버려도 60점 이상임을 검사하는데는 문제없음
            if(avg>=60) {
                System.out.println("pass");
                countPass++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.print(countPass);
    }
}