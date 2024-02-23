import java.util.*;

public class Main {
    final static int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int dateToDays(int m, int d) {
        int monthToDay = 0;
        for(int i=1; i<m-1; i++) { //이전달까지는 그냥 더함
            monthToDay+=numOfDays[i];
        }
        
        return monthToDay + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
       
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.print(dateToDays(m2,d2)-dateToDays(m1,d1));
    }
}