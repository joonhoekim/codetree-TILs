import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midterm = sc.nextInt();
        int finalExam = sc.nextInt();
        if(midterm<90) {
            System.out.println(0);
        } else if(finalExam < 90) {
            System.out.println(0);
        } else if(finalExam < 95) {
            System.out.println(50000);
        } else {
            System.out.println(100000);
        }

    }
}