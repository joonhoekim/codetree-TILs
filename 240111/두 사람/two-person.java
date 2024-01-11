import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String sex1 = sc.next();
        int age2 = sc.nextInt();
        String sex2 = sc.next();

        //아직 이 메서드는 안배웠던 것 같은데?
        if ((sex1.equals("M")  && age1 >= 19) || (sex2.equals("M") && age2 >= 19)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}