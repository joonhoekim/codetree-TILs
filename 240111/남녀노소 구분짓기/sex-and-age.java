import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt(); //0=M, 1=F
        int age = sc.nextInt();
        if(sex==0){
            if(age>=19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if(age>=19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
            //코드트리님.. 문제 설명에 이상/이하를 제대로 적어주셔야죠... 영어..
        }




    }
}