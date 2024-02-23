import java.util.*;

public class Main {
    final static int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //no reap year
    final static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; //idx 0 = Mon

    static int toDays(int m, int d) {
        int sum = 0;
        for(int i=1; i<m; i++) {
            sum+=numOfDays[i];
        }
        return sum + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month1 = sc.nextInt();
        int day1 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        int diff = toDays(month2, day2) - toDays(month1, day1);
        int ans = diff<0? 7+diff%7 : diff%7; //나누는 수의 부호는 무시됨. 나눠지는 수의 부호를 따라감.
        
        System.out.print(days[ans]);
    }
}