import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int countMultiple3 = 0;
        int countMultiple5 = 0;
        for(int i=0; i<10; i++){
            int input = sc.nextInt();
            if(input%3==0) {
                countMultiple3++;
            }
            if(input%5==0) {
                countMultiple5++;
            }
        }
        System.out.printf("%d %d",countMultiple3,countMultiple5);
    }
}