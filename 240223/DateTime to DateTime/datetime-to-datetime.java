import java.util.*;

public class Main {
    final static int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //no reap year

    static long dateToMin(int day, int hour, int minute) { //월 계산이 없어서 간단해지네...
        return day*24*60 + hour*60 + minute;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        long diff = dateToMin(day,hour,minute) - dateToMin(11,11,11);
        diff = diff<0 ? -1 : diff;
        System.out.print(diff);
    }
}